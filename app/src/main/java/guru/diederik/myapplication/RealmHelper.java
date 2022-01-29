package guru.diederik.myapplication;

import android.content.Context;

import io.realm.Realm;
import io.realm.mongodb.App;
import io.realm.mongodb.AppConfiguration;

public class RealmHelper {

    public static void init(Context context){

        Realm.init(context);

        App app = new App(new AppConfiguration.Builder("XXXYYYZZZ")
                .build());

    }


}
