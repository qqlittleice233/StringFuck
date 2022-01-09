package icu.nullptr.stringfuck.unittest;

import java.nio.charset.StandardCharsets;

@SuppressWarnings("unused")
public class MyDecryptor {

    public static String decrypt(byte[] cypherBytes) {
        return new String(cypherBytes, StandardCharsets.UTF_8);
    }
}
