package com.algebra.sports;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class BasketballActivity extends Activity implements OnItemClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sports);

		BasketballData.LoadData();
		ListView listView = (ListView) findViewById(R.id.sports_list_view);
		String[] ids = new String[BasketballData.Items.size()];
		for (int i = 0; i < ids.length; i++) {

			ids[i] = Integer.toString(i + 1);
		}

		BasketballAdapter adapter = new BasketballAdapter(this,
				R.layout.row_all_sports, ids);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(this);
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {

		switch (position) {
		case 0:

			ShowDialog.showDialogPhoneMail(this, "Nazovi HKK Vukovar",
					"Pošalji mail HKK Vukovar", "tel:032450767", "hkkv@net.hr",
					45.33712, 19.01185);
			break;
		case 1:

			ShowDialog.showDialogPhone(this, "Nazovi KK Borovo",
					"tel:0998071192", 45.34524, 19.00102);

			break;
		}

	}
}