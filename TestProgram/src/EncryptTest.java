import java.io.*;

import javax.crypto.*;

public class EncryptTest {

	  public static void main(String[] args) throws Exception {
	    desEncrypt("plaintextfile", "ciphertextfile");
	  }

	  public static void desEncrypt(String f1, String f2) throws Exception {
	    SecretKey key = null;
	    ObjectInputStream keyFile = new ObjectInputStream(new FileInputStream("G:\\Jar Files\\TestFiles\\DES.ser"));
	    key = (SecretKey) keyFile.readObject();
	    keyFile.close();

	    KeyGenerator keygen = KeyGenerator.getInstance("DES");
	    key = keygen.generateKey();
	    ObjectOutputStream keyFileout = new ObjectOutputStream(new FileOutputStream("DESKey.ser"));
	    keyFileout.writeObject(key);
	    keyFileout.close();
	    Cipher cipher = null;
	    cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
	    cipher.init(Cipher.ENCRYPT_MODE, key);
	    BufferedInputStream in = new BufferedInputStream(new FileInputStream(f1));

	    CipherOutputStream out = new CipherOutputStream(new BufferedOutputStream(new FileOutputStream(
	        f2)), cipher);
	    int i;
	    do {
	      i = in.read();
	      if (i != -1)
	        out.write(i);
	    } while (i != -1);
	    in.close();
	    out.close();
	  }
}
