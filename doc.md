### IDEA快捷键
 描述|键位
 ---|:---
 查找类|`cmd+O`
 查找文件|`cmd+shift+O`
 全局查找|`cmd+shift+F`
 跳转行|`cmd+L`
 最近打开过的文件|`cmd+E`
 跳转到上一次浏览的位置|`cmd+option+←`
 撤销跳转到上一次浏览的位置|`cmd+option+→`
 重命名|`shift+F6`
 删除行|`cmd+Del/shift+Del`
 复制行|`cmd+D`
 快捷生成代码|`cmd+N`
 格式化代码|`cmd+option+`
 快捷生成语法|`cmd+option+T`
 覆盖父类方法|`ctrl+O`
 实现父类方法|`ctrl+I`
 查看类属性列表|`cmd+7`
 大小写转换|`cmd+shift+U`
 
### Git设置
生成秘钥SSH-Key, 在~/.ssh/目录会生成`id-rsa_lab`和`id-rsa_lab.pub`私钥和公钥。
 > `$ ssh-keygen -t rsa -C "注册的gitlab邮箱" -f ~/.ssh/id_rsa_lab`

 > `$ ssh-keygen -t rsa -C "注册的github邮箱" -f ~/.ssh/id_rsa_hub`

设置用户信息
 > `$ git config --global user.name "John Doe"`

 > `$ git config --global user.email johndoe@example.com`

获取Git仓库
 > `$ git init`

 > `$ git clone https://github.com/libgit2/libgit2 mylibgit`

检查当前文件状态
 > `$ git status`

 > `$ git status -s`

跟踪文件
 > `$ git add filename`

忽略文件列表
 > `.gitignore`

查看已暂存和未暂存的修改
 > `$ git diff`

 > `$ git diff --staged`

提交更新
 > `$ git commit`

 > `$ git commit -m "fix bug"`

 > `$ git commit -a -m 'added new benchmarks'`

移除文件
 > `$ git rm filename`

 > `$ git rm filename -f`

移动文件
 > `$ git mv file_from file_to`

查看提交历史
 > `$ git log`

 > `$ git log -p -2`  或 --patch

 > `$ git log --stat`

 > `$ git log --pretty=oneline`

 > `$ git log --pretty=format:"%h - %an, %ar : %s"`

 > `$ git log --pretty=format:"%h %s" --graph`

 > `$ git log --pretty="%h - %s" --author='Junio C Hamano' --since="2008-10-01"        --before="2008-11-01" --no-merges`

撤消操作
 > `$ git commit --amend`

取消暂存的文件
 > `$ git reset HEAD filename`

撤消对文件的修改
 > `$ git checkout -- filename`

查看远程仓库
 > `$ git remote`

 > `$ git remote -v`

添加远程仓库
 > `$ git remote add pb https://github.com/paulboone/ticgit`

从远程仓库中抓取与拉取
 > `$ git fetch <remote>`

 > `git pull`

推送到远程仓库
 > `git push <remote> <branch>`

查看某个远程仓库
 > `git remote show <remote>`

远程仓库的重命名与移除
 > `$ git remote rename oldName newName`

 > `$ git remote remove name`

 processPinpadResponse.sdi
 `APDInterfaceService.html` `APDInterfaceApplet.html`
 
 new cui: `npm install` > `npm satrt` / `npm run build:dev` / `npm run build:prod`


 123 asd

