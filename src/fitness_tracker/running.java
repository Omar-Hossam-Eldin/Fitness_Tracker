
package fitness_tracker;


public class running  {
    private int calories=0;
    public double heart_rate=80f;

    public int getCalories(int time) {
        calories=5*time;
        return calories;
    }

    public double getHeart_rate(int time) {
        double newheart_rate;
        newheart_rate = heart_rate + (heart_rate * time  * 0.003);
        return newheart_rate;
    }
    
}
