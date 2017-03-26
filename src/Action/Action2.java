package Action;



/**
 * Created by Taron on 03/26/17.
 */
public class Action2 extends Action {


    @Override
    public int doAction(int[] numbers) {
        int sum = 0;
        for(int i = 0;i < numbers.length / 2;i++){
            sum += numbers[i];
        }
        for (int i = numbers.length / 2;i < numbers.length;i++){
            sum -= numbers[i];
        }
        return sum;
    }
}
