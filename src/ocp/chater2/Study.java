package ocp.chater2;

/**
 * @author $ Devalère
 **/
@FunctionalInterface interface Study {
    abstract int learn(String subject, int duration);
}
class BiologyMaterial implements Study {
    @Override public int learn(String subject, int duration) {
        if(subject == null)
            return duration;
        else
            return duration+1;
    } }
