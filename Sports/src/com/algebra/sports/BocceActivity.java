package com.algebra.sports;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class BocceActivity extends Activity implements OnItemClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sports);

		BocceData.LoadData();
		ListView listView = (ListView) findViewById(R.id.sports_list_view);
		String[] ids = new String[BocceData.Items.size()];
		for (int i = 0; i < ids.length; i++) {

			ids[i] = Integer.toString(i + 1);
		}

		BocceAdapter adapter = new BocceAdapter(this, R.layout.row_all_sports,
				ids);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(this);
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {

		switch (position) {
		case 0:

			ShowDialog.showDialogTwoPhone(this, "Nazovi BK Mitnica (tel)",
					"Nazovi BK Mitnica (mob)", "tel:032410493",
					"tel:0915418529", 45.34075, 19.00834);
			break;
		case 1:

			ShowDialog.showDialogTwoPhone(this,
					"Nazovi BK Trpinjska cesta (mob1)",
					"Nazovi BK Trpinjska cesta (mob2)", "tel:098866165",
					"tel:0989929013", 45.38158, 18.95913);
			break;
		case 2:

			ShowDialog.showDialogPhone(this, "Nazovi BK Borovo",
					"tel:032421252", 45.37752, 18.96440);

			break;
		case 3:

			ShowDialog.showDialogPhone(this, "Nazovi BK Dunav Sotin",
					"tel:0989799282", 45.28975, 19.10515);
			break;
		}

	}
}