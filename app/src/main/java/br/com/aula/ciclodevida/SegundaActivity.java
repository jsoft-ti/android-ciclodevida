package br.com.aula.ciclodevida;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class SegundaActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        Log.d("SegundaActivity","Método onCreate");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("SegundaActivity","Método onPause");
    }


}
