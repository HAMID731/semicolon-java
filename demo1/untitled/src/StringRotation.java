public class StringRotation {

    public boolean canRotate(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        if (s.isEmpty()) {
            return true;
        }
        String doubledS = s + s;
        return doubledS.contains(goal);
    }


}