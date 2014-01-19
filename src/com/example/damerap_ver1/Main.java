package com.example.damerap_ver1;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;

public class Main extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		String[] lista = new String[20];
		
		lista[0] = "QpuL7FpDe";
		lista[1] = "dVCIrDvdi0U";
		lista[2] = "H4xPU0MkA3Q";
		lista[3] = "vHdkmNPNcV8";
		lista[4] = "KGl_2e7JfC0";
		lista[5] = "v2YhtP-m4_0";
		lista[6] = "IybPMFmVq4U";
		lista[7] = "UXWFqxKU2qA";
		lista[8] = "883yQqdOaLg";


		
		int valorDado = (int) Math.floor(Math.random()*8+1);
		
		String videoId = lista[valorDado];
		Intent videoClient = new Intent(Intent.ACTION_VIEW);
	    videoClient.setData(Uri.parse("http://m.youtube.com/watch?v="+videoId));
	    startActivityForResult(videoClient, 1234);
		
		//Intent lVideoIntent = new Intent(null, Uri.parse("ytv:qpke-04tOIs"), Main.this, OpenYouTubePlayerActivity.class);
		//startActivity(lVideoIntent);
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		

		
		return true;
	}

}
