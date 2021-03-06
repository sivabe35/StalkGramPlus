package app.stalkgram.com.stalkgramplus.main;

import app.stalkgram.com.stalkgramplus.main.UI.MainView;
import app.stalkgram.com.stalkgramplus.main.events.MainEvent;

/**
 * Created by elio on 8/5/16.
 */
public interface MainPresenter {
    void onCreate();
    void onDestroy();

    void downloadFile(String url);
    void shareFile();
    void setAsFile();
    void onEventMainThread(MainEvent event);

    void checkIfStorageIsAvailable();

    MainView getView();
}
