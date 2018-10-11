package com.fukaimei.alipay.bean;

// TODO: 2018/10/11 0011  沙箱环境配置好像有问题
public class AlipayConstants {

    // 商户PID
//    public static final String PARTNER = "2088811977704990";
    public static final String PARTNER = "2016091300503694";

    // 商户收款账号--邮箱或者手机号
//    public static final String SELLER = "dev@ifensi.com";
    public static final String SELLER = "bblvnl7623@sandbox.com";

    // 商户私钥，pkcs8格式
//        public static final String RSA_PRIVATE =
//            "MIICXQIBAAKBgQDlQ468L1A7Q+GG80/Z8f3IsSiiFIluSxfTTSuJ/XSPzvYS+bMZ"
//                    + "AQLMqq/nGhkp+1Q5pHF9LAQtQS3gL2pqzbKdtvZSsy/tNFFQcGCsgK2ygMl+MW/F"
//                    + "g/ufx7c1jy1kZAeDyl1m302dnRrtSgDalkgH7FKRcmDxbXPTnFGHbg9zMQIDAQAB"
//                    + "AoGAa28wGQF28H7L1Yh5V+FtkrlqGCHVkQjBfnRAPea205kheRzoD4SIwk4OJhb1"
//                    + "ydWLz4M+53BT+Lz9eXveu3PvCdQe9zMIVC5dKUNVYCvvcHZ+Ot8HriiuwGPb3Quu"
//                    + "twbnLGM5gxxPDo0yUyWrfaVn/qR35mS6TDfmgowVG8CmBpECQQDzuhodR/Jgxrtn"
//                    + "tka+88alyy+BfjUZqNloPuE7JfXrpOxH5lodk7Y4lTki/dlo5BrK+hrismLFr9Du"
//                    + "ueAJ7G9dAkEA8M8C6VnpUMAK5+rYcjKnQssDqcMfurKYEil1BD/TUdSbLI6v8p02"
//                    + "mv1ApuTVtQQypZJKIFfurGk0g0QlvzLZ5QJAGfY38+iHDAH/UnPbI1oKTfzPyaZs"
//                    + "95fB2NXh3hAUGw7NUHdcIAxs+6gBlxWdRAwQQpDTrlQ8KzyoL9XC5Ku3zQJBALO8"
//                    + "j5vEtFTFQl6f9zYlgJpmFTHcpg4fx0mnD+RAD2aAneHADquzlFJSvLLVEn2tyG+0"
//                    + "pQdHGqotTDi94L65IdECQQDb1h+5kugCu47IxsDkrLRsKVcr8dSDMORyeT1L0HWR"
//                    + "ctramBu+2PBz2UKC6+9dQ+ZQH4XTKpBSvkyZH4mYi1de";
    public static final String RSA_PRIVATE = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAJyH1gZyM5DpyBFDvm6gsxrKC12wmoaXrYjTiKQ/C468WWcj2ao38hmVWZazet4Wes2Qm0sIg0QLtXo4irr53/B6ScQR7ZMPVFN8VohW7wkHe/shCCyO1MhdjtE0P2vtxB/SdgMarpZWE0RapvR98QiNmJ4YZBeDRQmyiprP5vWNAgMBAAECgYALMwjUIz2fQ6rF2XP5lFPcOdKAXI9hy95lqMThA4W/K6i14XHEZQZUYEQtrR/AXhlhNdR2lOBXcQMGAJ+kaxZjkDaP+2o5SY4M7RtZDpaplx5LxjLwobySBn3mzt7/GNQaovO9KO5ch0ygQD+A/QtOK3PwiIuimVY6IIL0YaAWXQJBAO54bQY/VeZKZQeyLSGYE492MXhgBuCeLFkQGC4MwM8Ha3NsT7+ETd+sWn2+2SB9V3hGLIHWvdrJveg6NKvrhBMCQQCoCXQzeEKF1VRSqx4ChrhxUEMphMc/UW3TeM9dx8V/2ik0DOpoIWnWz1NLXhNdN63gFcnX1vAEREruV8Z4eJPfAkAiUCWv3nEnv9CluNeRm+ZEoEciAP88VsYe0pgIGEGuCG1HoHAhKJJj+tLSgSGQ8Tgi0EYbMKEE2D6BKc7mZe8NAkEAgSLKz2dDUFDSvblNlcls44A4LScibHGqwlLcogiNqiTBd4PZfO74xKGONKR2ozPQBx8XgC1pRQ4qu6JvH1Qi5wJBAJbBjWjfQpdntEJRCH8ntqDxRDH5UW72A0zytSPN6IRaCOJFpdTTYM3EnVh3gWFahDYnXOcvUsWC+STWisIqtMA=";

    // 支付宝公钥
//    public static final String RSA_PUBLIC = "";
	public static final String RSA_PUBLIC = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCnxj/9qwVfgoUh/y2W89L6BkRAFljhNhgPdyPuBV64bfQNN1PjbCzkIM6qRdKBoLPXmKKMiFYnkd6rAoprih3/PrQEB/VsW8OoM8fxn67UDYuyBTqA23MML9q1+ilIZwBC2AQ2UBVOrFXfFl75p6/B5KsiNG9zpgmLCUYuLkxpLQIDAQAB";

    public static final int SDK_PAY_FLAG = 1;
    public static final int SDK_CHECK_FLAG = 2;

}
