package kr.hs.emirim.sjung.imageslideshow;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ViewFlipper;
import android.widget.Button;


public class MainActivity extends Activity implements View.OnClickListener{

    ViewFlipper flip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        flip=(ViewFlipper)findViewById(R.id.view_flip);
        flip.setFlipInterval(1000);//1초간격

        Button butStart=(Button)findViewById(R.id.but_start);
        butStart.setOnClickListener(this);//현재클래스는 온클릭이면서 핸들러가 됨

        Button butStop=(Button)findViewById(R.id.but_stop);
        butStop.setOnClickListener(this);//this : 핸들러 클래스 객체


    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        switch(v.getId())//메소드로 들어온 매개변수의 id값을 반환
        {
            case R.id.but_start:
                flip.startFlipping();
                break;
            case R.id.but_stop:
                flip.stopFlipping();
                break;
        }
    }
}
