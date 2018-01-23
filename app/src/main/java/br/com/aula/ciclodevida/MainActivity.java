package br.com.aula.ciclodevida;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity","Método onCreate");
    }

    public void abrirSegundaActivity(View view){
        Intent it = new Intent(this,SegundaActivity.class);
        Log.d("MainActivity","Método abrirSegundaActivity");
        startActivity(it);
    }






    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity","Método onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity","Método onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MainActivity","Método onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity","Método onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity","Método onDestroy");
    }
}
