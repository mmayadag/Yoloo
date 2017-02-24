package com.yoloo.backend.util;

import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import io.reactivex.Observable;
import java.util.Set;
import lombok.experimental.UtilityClass;

@UtilityClass
public class StringUtil {

  public static ImmutableList<String> splitToList(final String args, final String rule) {
    return ImmutableList.copyOf(args.split("\\s*" + rule + "\\s*"));
  }

  public static ImmutableSet<String> splitToSet(final String args, final String rule) {
    return ImmutableSet.copyOf(args.split("\\s*" + rule + "\\s*"));
  }

  public static Observable<Set<String>> splitToSetObservable(String args, String rule) {
    return Observable.just(ImmutableSet.copyOf(args.split("\\s*" + rule + "\\s*")));
  }

  public static ImmutableSet<String> split(String args, String delimiter) {
    return ImmutableSet.copyOf(Splitter.on(delimiter).trimResults().omitEmptyStrings().split(args));
  }
}
