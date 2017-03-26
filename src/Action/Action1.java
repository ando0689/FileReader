package Action;


/**
 * Created by Taron on 03/25/17.
 */
public class Action1 extends Action {


    @Override
    public int doAction(int[] numbers) {
        int sum = 0;
        for (int i = 0;i < numbers.length;i++){
            sum += numbers[i];
        }
        return sum;
    }
}
