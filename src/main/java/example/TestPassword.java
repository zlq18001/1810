package example;


import java.util.UUID;
import example.util.PasswordAddSalt;
public class TestPassword{

    public static void main(String[] args) {
        String oldPassword = "123456abcdefasdasffbdfadshjfb_asdfanj";
        String salt = UUID.randomUUID().toString();
        salt = salt.replace("-","");
        //salt = "a69ffb7ea6a44e69f90c5c199da2b6a";
        PasswordAddSalt passwordAddSalt = new PasswordAddSalt(salt, "sha-256");
        String newPassword = passwordAddSalt.encode(oldPassword);

        System.out.println("老密码：" + oldPassword);
        System.out.println("盐：" + salt);
        System.out.println("加盐加密密码：" + newPassword);
        //newPassword = "1@0B0j2S1A1r1-0K3t0q2O1r161X2-2y0d2p1t0i1X361W0-0l2k1k2a1D1#3G0U";
        System.out.println("密码验证：" + passwordAddSalt.isPasswordValid(newPassword, oldPassword));

    }
}


