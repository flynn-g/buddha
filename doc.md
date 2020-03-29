1.IDEA Mac快捷键
 cmd+O 查找类
 cmd+shift+O 查找文件
 cmd+shift+F 全局查找
 cmd+L 跳转行
 cmd+E 最近打开过的文件
 cmd+option+← 跳转到上一次浏览的位置
 cmd+option+→ 撤销跳转到上一次浏览的位置
 shift+F6 重命名
 cmd+Del||shift+Del 删除行
 cmd+D 复制行
 cmd+N 快捷生成代码
 cmd+option+L 格式化代码
 cmd+option+T 快捷生成语法
 ctrl+O 覆盖父类方法
 ctrl+I 实现父类方法
 cmd+7 查看类属性列表
 cmd+shift+U 大小写转换
 
2.Git
 生成秘钥SSH-Key
 # 在~/.ssh/目录会生成id-rsa_lab和id-rsa_lab.pub私钥和公钥。
 $ ssh-keygen -t rsa -C "注册的gitlab邮箱" -f ~/.ssh/id_rsa_lab
 # 在~/.ssh/目录会生成id_rsa_hub和id_rsa_hub.pub私钥和公钥。
 $ ssh-keygen -t rsa -C "注册的github邮箱" -f ~/.ssh/id_rsa_hub
 设置用户信息
 $ git config --global user.name "John Doe"
 $ git config --global user.email johndoe@example.com
 获取Git仓库
 $ git init
 $ git clone https://github.com/libgit2/libgit2 mylibgit
 检查当前文件状态
 $ git status     
 $ git status -s
 跟踪文件
 $ git add filename
 忽略文件
 .gitignore
 查看已暂存和未暂存的修改
 $ git diff
 $ git diff --staged
 提交更新
 $ git commit
 $ git commit -m "fix bug"
 $ git commit -a -m 'added new benchmarks'
 移除文件
 $ git rm filename
 $ git rm filename -f
 移动文件
 $ git mv file_from file_to



	
