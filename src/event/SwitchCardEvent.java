
package event;

import view.MainView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwitchCardEvent implements ActionListener {
    
    private MainView mainView;

    public SwitchCardEvent(MainView mainView) {
        this.mainView = mainView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        switch (src) {
            case "Nhập liệu":
                mainView.getCardLayout().show(mainView.getContentPanel(), "input");
                break;
            case "Danh sách":
                mainView.getCardLayout().show(mainView.getContentPanel(), "list");
                break;
            
        }
    }
    
    
}
