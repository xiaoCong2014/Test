package mvvm;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import a.test.R;
import a.test.databinding.Mvvm2Binding;
import a.test.databinding.Mvvm3Binding;
import a.test.databinding.MvvmBinding;
import a.test.databinding.MvvmImageBinding;
import a.test.databinding.MvvmIsVisibleBinding;
//import a.test.databinding.Mvvm2Binding;
//import a.test.databinding.MvvmBinding;

/**
 * mvvm.MVVM_Activity
 */
public class MVVM_Activity extends Activity {

    /**
     * 测试一下新的布局文件有没有错
     */
    public void bindingData_test() {

    }

    public void bindingData_1() {
        MvvmBinding mvvmBinding = DataBindingUtil.setContentView(this, R.layout.mvvm);
        User user = new User("Test1", "User1");
        mvvmBinding.setUser(user);
        mvvmBinding.setMyHandlers(new MyHandlers());
    }

    public void bindingData_2() {
        Mvvm2Binding mvvm2Binding = DataBindingUtil.setContentView(this, R.layout.mvvm_2);
//        mvvm2Binding.setVariable(R.id.)
        mvvm2Binding.setBean(new Bean("xiaoCong", "2"));
    }

    public void bindingData_3() {
        Mvvm3Binding mvvm3Binding = DataBindingUtil.setContentView(this, R.layout.mvvm_3);
        //用 Binding类.inflate(getLayoutInflater());
        // Mvvm2Binding mvvm2Binding = Mvvm2Binding.inflate(getLayoutInflater());
        mvvm3Binding.setBean(new Bean("xiaoCong", "3"));
        mvvm3Binding.setMyHandlers(new MyHandlers());
    }

    //mvvm_binding_events
    //mvvm_binding_events.xml
    public void bindingEvents() {
//        Mvvm2Binding mvvm2Binding=DataBindingUtil.setContentView(this,R.layout.mvvm_binding_events);
//        mvvm2Binding.setBean(new Bean("xiaoCong","3",true) );
//        //这边忘了传对象进去也没事，我猜，View那里默认传了空对象
//        mvvm2Binding.setMyHandlers(new MyHandlers());

//        mvvm2Binding.setBean(new Bean("xiaoCong","3",true) );

//        Mvvm2Binding mvvm2Binding = Mvvm2Binding.inflate(getLayoutInflater());
//        mvvm2Binding.setBean(new Bean("xiaoCong","3"));
        //不判断，跟M的某个方法绑定，直接打印一句话之类的

        //判断，在View里
        //判断，在M里
    }

    /**
     * V的一个控件的可视化，根据M的isVisible
     */
    public void bindingData_isVisible() {
        //test mvvm_is_visible.xml
        MvvmIsVisibleBinding mvvmIsVisibleBinding = DataBindingUtil.setContentView(this, R.layout.mvvm_is_visible);

        Bean bean = new Bean("bindingData_test", "3");
        bean.isFriend = true;
        bean.isVisible = false;
//        bean.isVisible = true;

        mvvmIsVisibleBinding.setBean(bean);
        mvvmIsVisibleBinding.setMyHandlers(new MyHandlers());
    }

    public void test() {
        setContentView(R.layout.test);
    }

    public void bindingData_hasImage() {
        //test mvvm_is_visible.xml
        MvvmImageBinding mvvmImageBinding = DataBindingUtil.setContentView(this, R.layout.mvvm_image);

        ImageBean imageBean = new ImageBean();
        //  imageBean.hasImage = true;
        imageBean.hasImage = false;

        mvvmImageBinding.setImageBean(imageBean);


//        mvvmIsVisibleBinding.setBean(bean);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //  test();
        // bindingData_test();
        //  bindingData_1();
        //bindingData_2();
        // bindingData_3();

        //TODO 双向绑定的事件
        //bindingEvents();

        //bindingData_isVisible();

        //TODO  pass parm in V

        bindingData_hasImage();




    }



}

