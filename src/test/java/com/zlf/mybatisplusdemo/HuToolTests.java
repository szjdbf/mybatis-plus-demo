package com.zlf.mybatisplusdemo;

import cn.hutool.crypto.digest.DigestUtil;
import org.junit.jupiter.api.Test;

public class HuToolTests {

    @Test
    void testMd5() {
        String str = DigestUtil.md5Hex("i love you");
        System.out.println(str);
    }


}
