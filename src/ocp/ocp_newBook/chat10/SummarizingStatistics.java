package ocp.ocp_newBook.chat10;

import java.util.IntSummaryStatistics;
import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * @author $ Devalère
 **/
public class SummarizingStatistics {
    public static void main(String[] args) {

    }

    /*  You’ve learned enough to be able to get the maximum value from a stream of int primitives.
        If the stream is empty, we want to throw an exception.*/
    private static int max(IntStream ints) {
        OptionalInt optional = ints.max();
        return optional.orElseThrow(RuntimeException::new);
    }

    /*This should be old hat by now. We got an OptionalInt because we have an
IntStream. If the optional contains a value, we return it. Otherwise, we throw a new
RuntimeException.*/

    /**
     * Now we want to change the method to take an IntStream and return a range. The
     * range is the minimum value subtracted from the maximum value. Uh-oh. Both min() and
     * max() are terminal operations, which means that they use up the stream when they are run.
     * We can’t run two terminal operations against the same stream. Luckily, this is a common
     * problem, and the primitive streams solve it for us with summary statistics. Statistic is just a
     * big word for a number that was calculated from data.
     */
    private static int range(IntStream ints) {
        IntSummaryStatistics stats = ints.summaryStatistics();
        if (stats.getCount() == 0) throw new RuntimeException();
        return stats.getMax() - stats.getMin();
    }
/**
 *    Here we asked Java to perform many calculations about the stream. Summary statistics
 *     include the following:
 *    ■ getCount(): Returns a long representing the number of values.
 *    ■ getAverage(): Returns a double representing the average. If the stream is empty, returns 0.
 *    ■ getSum(): Returns the sum as a double for DoubleSummaryStream and long for
 *     IntSummaryStream and LongSummaryStream.
 *    ■ getMin(): Returns the smallest number (minimum) as a double, int, or long, depending on
 *     the type of the stream. If the stream is empty, returns the largest numeric value based
 *     on the type.
 *    ■ getMax(): Returns the largest number (maximum) as a double, int, or long depending on the type of the stream. If the stream is empty, returns the smallest numeric value
 *     based on the type.*/
}
