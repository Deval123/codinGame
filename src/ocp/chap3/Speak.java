package ocp.chap3;

/**
 * @author $ Devalère
 **/
public interface Speak {
    default int talk(){
        return 7;
    }
}
