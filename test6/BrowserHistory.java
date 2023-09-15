package test6;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {
	List<String> history;
    int idx = 0;
    public BrowserHistory(String homepage) {
    	history = new ArrayList<>();
    	history.add(homepage);
    	idx = 0;
    }

    public void visit(String url) {
        for(int i = history.size() - 1; i > idx; i--){
        	history.remove(i);
        }
        history.add(url);
        idx++;
    }

    public String back(int steps) {
        if(idx <= steps){
        	idx = 0;
        }else{
        	idx = idx - steps;
        }
        return history.get(idx);
    }

    public String forward(int steps) {
        int size = history.size();
        if(steps + idx < size){
        	idx += steps;
        }else{
        	idx = size - 1;
        }
        return history.get(idx);
    }
}
