package base;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBase {
    private Map<String, String> loginAndPass = new HashMap<>();
    private Map<String, List<Account>> openedAccounts = new HashMap<>();
    public int status;

    public Map<String, String> getLoginAndPass() {
        return loginAndPass;
    }

    public void addLoginAndPass(String login, String pass) {
        loginAndPass.put(login, pass);
    }

    public Map<String, List<Account>> getOpenedAccounts() {
        return openedAccounts;
    }

    public void addOpenedAccount(String user, List<Account> accounts) {
        openedAccounts.put(user, accounts);
    }
}
