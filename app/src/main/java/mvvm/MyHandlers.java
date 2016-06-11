package mvvm;

import android.view.View;
import android.widget.Toast;

/**
 * MyHandlers  myHandlers
 * 方法的第一个参数是OS自动传进来的，
 * 在View里调用M的方法的时候，无视方法里的View view参数
 */
public class MyHandlers {
    public void onClickFriend(View view) {
//        Toast.makeText(MyHandlers.this, "MyHandlers onClickFriend", Toast.LENGTH_SHORT).show();
        Toast.makeText(view.getContext(), "MyHandlers onClickFriend", Toast.LENGTH_SHORT).show();
    }

    public void onClickEnemy(View view) {
        Toast.makeText(view.getContext(), "MyHandlers onClickEnemy", Toast.LENGTH_SHORT).show();
    }


    public void hello(View view) {
        Toast.makeText(view.getContext(), "MyHandlers hello", Toast.LENGTH_SHORT).show();
    }

    public void helloBeanName(View view, String beanName) {
        Toast.makeText(view.getContext(), "MyHandlers hello " + beanName, Toast.LENGTH_SHORT).show();
    }

    /**
     * bean.name
     */
    public void helloBean(View view, Bean bean) {
        Toast.makeText(view.getContext(), "MyHandlers hello " + bean.name, Toast.LENGTH_SHORT).show();
    }
}
