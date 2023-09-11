package exercises;

// TAGS Array.length, boolean, methods, operators-relational, parameters, return, String, String.split()

/* DESCRIPTION
https://edabit.com/challenge/hdT772EaY6ofm4ef4
Broken Bridge
Create a function which validates whether a bridge is safe to walk on (i.e. has no gaps in it to fall through).

Examples
isSafeBridge("####") ➞ true
isSafeBridge("## ####") ➞ false
isSafeBridge("#") ➞ true
isSafeBridge("### ####") ➞ false
isSafeBridge("#####") ➞ true
Notes
You can expect the bridge's ends are connected to its surrounding.
 */

public class BrokenBridge {
    public static void main(String[] args) {
        System.out.println(isSafeBridge("####"));
        System.out.println(isSafeBridge("## ####"));
        System.out.println(isSafeBridge("#"));
        System.out.println(isSafeBridge("### ####"));
        System.out.println(isSafeBridge("#####"));
    }

    private static boolean isSafeBridge(String bridge) {
        return bridge.split(" ").length == 1;
    }
}
