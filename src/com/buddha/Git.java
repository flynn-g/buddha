package com.buddha;

/**
 *  Git: https://git-scm.com/downloads
 *  Mirrors: https://npm.taobao.org/mirrors/git-for-windows/
 *
 *  1. 设置Git的user name和email
 *      $ git config --global user.name "dandelion"
 *      $ git config --global user.email "278776007@qq.com"
 *      $ Git config --global --list
 *  2. 生成密钥 (自动生成目录.shh， 私钥id_rsa 和 公钥id_rsa.pub）
 *      $ ssh-keygen -t rsa -C "278776007@qq.com"
 *  3. 登陆Github, 添加 ssh. 把id_rsa.pub文件里的内容复制到github
 *  4. 测试：
 *      $ ssh -T git@github.com
 *
 */
public class Git {

}
