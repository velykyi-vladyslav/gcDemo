package velykyi.vladyslav;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * <p>Description of log file in console output. Additional information you can find in the README.md file.</p>
 * <p>2022-03-28T22:08:08.831+0300 - Time when the GC event started.</p>
 * <p>0.229 - Time when the GC event started, relative to the JVM startup time. Measured in seconds.</p>
 * <p>GC - Flag to distinguish between Minor & Full GC. This time it is indicating that this was a Minor GC.</p>
 * <p>Allocation Failure - Cause of the collection. In this case, the GC is triggered due to a data structure not fitting into any region in the Young Generation.</p>
 * <p>PSYoungGen - Name of the garbage collector used, representing a parallel mark-copy stop-the-world garbage collector used to clean the Young generation.</p>
 * <p>65024K->10736K - Usage of the Young Generation before and after collection.</p>
 * <p>(75776K) - Total size of the Young Generation.</p>
 * <p>65024K->21064K - Total used heap before and after collection.</p>
 * <p>(249344K) - Total available heap.</p>
 * <p>0.0151079 secs - Duration of the GC event in seconds.</p>
 * <p>Times: user=0.02 sys=0.00, real=0.01 secs - Duration of the GC event, measured in different categories:</p>
 * <li>user – Total CPU time that was consumed by the garbage collector threads during this collection
 * <li>sys – Time spent in OS calls or waiting for system event
 * <li>real – Clock time for which your application was stopped. As Serial Garbage Collector always uses just a single thread, real time is thus equal to the sum of user and system times.
 */
public class Application {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        while (true) {
            map.put(new Random().toString(), new Random().nextInt());
        }
    }
}
