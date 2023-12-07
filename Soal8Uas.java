package soal8uas;
public class Soal8Uas {
    public static void main(String[] args) {
        String username;
        String password;
        boolean isActive;
        
        public UserAccount(String username, String password) {
            this.username = username;
            this.password = password;
            this.isActive = true;
        }
        
        public void ActiveAccount() {
            this.isActive = true;
        }
        
        public void deactiveAccount() {
            this.isActive = false;
        }
        
        public String getUsername () {
            return username;
        }
        
        public String getPassword() {
            return password;
        }
        
        public boolean isActive() {
            return isActive;
        }
    }
    

