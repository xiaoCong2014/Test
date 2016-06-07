package mvvm;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import a.test.R;
import a.test.databinding.MvvmBinding;

/**
 * mvvm.MVVM_Activity
 */
public class MVVM_Activity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bindingData_1();
    }

    public void bindingData_1() {
        MvvmBinding mvvmBinding=DataBindingUtil.setContentView(this, R.layout.mvvm);
        User user = new User("Test", "User");
        mvvmBinding.setUser(user);

    /*
     MainActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.main_activity);
   User user = new User("Test", "User");
   binding.setUser(user);
   */
    }

}

