package com.exam;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {
	Double sayi2,sayi3,sayi4;
	double sonuc;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Spinner acianListe = (Spinner)findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence>adapter = ArrayAdapter.createFromResource(this,R.array.tur, android.R.layout.simple_spinner_dropdown_item);
        acianListe.setAdapter(adapter);
        
        final ToggleButton toogle = (ToggleButton) findViewById(R.id.toggleButton1);
        
        final CheckBox ygs1 = (CheckBox)findViewById(R.id.checkBox1);
        final CheckBox ygs3 = (CheckBox)findViewById(R.id.checkBox2);
        
        final EditText edt1 = (EditText)findViewById(R.id.editText1);
        final EditText edt2 = (EditText)findViewById(R.id.editText2);
        final EditText edt3 = (EditText)findViewById(R.id.editText3);
        final EditText edt4 = (EditText)findViewById(R.id.editText4);
        
        final Button hesapla = (Button)findViewById(R.id.button1);
        
        final TextView txv9 = (TextView)findViewById(R.id.textView9);
        final TextView txv10 = (TextView)findViewById(R.id.textView10);
        
        ygs1.setEnabled(false);
        ygs3.setEnabled(false);
        edt1.setEnabled(false);
        edt2.setEnabled(false);
        edt3.setEnabled(false);
        edt4.setEnabled(false);
        hesapla.setEnabled(false);
        
        toogle.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) 
			{
				if(toogle.isChecked())
				{
					ygs1.setEnabled(true);
			        ygs3.setEnabled(true);
			        edt1.setEnabled(true);
			        edt2.setEnabled(true);
			        edt3.setEnabled(true);
			        edt4.setEnabled(true);
			        hesapla.setEnabled(true);
			        toogle.setEnabled(true);
			        
			        Toast.makeText(MainActivity.this, "Durum Aktifleþtirildi.", Toast.LENGTH_SHORT).show();
				}
				else
				{
					ygs1.setEnabled(false);
			        ygs3.setEnabled(false);
			        edt1.setEnabled(false);
			        edt2.setEnabled(false);
			        edt3.setEnabled(false);
			        edt4.setEnabled(false);
			        hesapla.setEnabled(false);
			        toogle.setEnabled(true);
			        
			        Toast.makeText(MainActivity.this, "Durum Pasifleþtirildi.", Toast.LENGTH_SHORT).show();
				}
				
			}	
		});
        
        hesapla.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				if(ygs1.isChecked())
				{
					double sayi1 = Double.parseDouble(edt1.getText().toString());
					double sayi2 = Double.parseDouble(edt2.getText().toString());
					double sayi3 = Double.parseDouble(edt2.getText().toString());
					double sayi4 = Double.parseDouble(edt2.getText().toString());
					double sonuc = (sayi1*4)+(sayi2*3)+(sayi3*2)+(sayi4*1)+100;
					txv9.setText(Double.toString(sonuc));           
				}
				else
				{
					double sifir = 0;
					txv9.setText(Double.toString(sifir));
				}
				if(ygs3.isChecked())
				{
					double sayi1 = Double.parseDouble(edt1.getText().toString());
					double sayi2 = Double.parseDouble(edt2.getText().toString());
					double sayi3 = Double.parseDouble(edt2.getText().toString());
					double sayi4 = Double.parseDouble(edt2.getText().toString());
					double sonuc = (sayi1*2)+(sayi2*1)+(sayi3*4)+(sayi4*3)+100;
					txv10.setText(Double.toString(sonuc));           
				}
				else
				{
					double sifir = 0;
					txv10.setText(Double.toString(sifir));
				}
			}
		});
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
