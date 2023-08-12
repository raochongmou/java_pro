- [![CSDN首页](https://img-home.csdnimg.cn/images/20201124032511.png)

  # 如何在windows上使用VMware安装macOS虚拟机

  ![img](https://csdnimg.cn/release/blogv2/dist/pc/img/original.png)

  [smart_cat](https://blog.csdn.net/hubing_hust)![img](https://csdnimg.cn/release/blogv2/dist/pc/img/newCurrentTime2.png)于 2023-01-07 23:00:19 发布![img](https://csdnimg.cn/release/blogv2/dist/pc/img/articleReadEyes2.png)6939![img](https://csdnimg.cn/release/blogv2/dist/pc/img/tobarCollect2.png) 收藏 15

  分类专栏： [macOS](https://blog.csdn.net/hubing_hust/category_12165127.html) 文章标签： [windows](https://so.csdn.net/so/search/s.do?q=windows&t=all&o=vip&s=&l=&f=&viparticle=) [macos](https://so.csdn.net/so/search/s.do?q=macos&t=all&o=vip&s=&l=&f=&viparticle=) [虚拟机](https://so.csdn.net/so/search/s.do?q=虚拟机&t=all&o=vip&s=&l=&f=&viparticle=) [开发语言](https://so.csdn.net/so/search/s.do?q=开发语言&t=all&o=vip&s=&l=&f=&viparticle=) [ios](https://so.csdn.net/so/search/s.do?q=ios&t=all&o=vip&s=&l=&f=&viparticle=)

  版权

  [![img](https://img-blog.csdnimg.cn/20201014180756930.png?x-oss-process=image/resize,m_fixed,h_64,w_64)macOS专栏收录该内容](https://blog.csdn.net/hubing_hust/category_12165127.html)

  2 篇文章1 订阅

  订阅专栏

  

  ### 如何在windows上使用VMware安装[macOS](https://so.csdn.net/so/search?q=macOS&spm=1001.2101.3001.7020)虚拟机

  - [一、准备工作](https://blog.csdn.net/hubing_hust/article/details/128596690#_1)
  - - [1.1 安装 VMware](https://blog.csdn.net/hubing_hust/article/details/128596690#11__VMware_7)
    - [1.2 下载macOS的安装包](https://blog.csdn.net/hubing_hust/article/details/128596690#12_macOS_17)
    - [1.3 下载VMware虚拟机解锁安装苹果系统工具](https://blog.csdn.net/hubing_hust/article/details/128596690#13_VMware_24)
  - [二、解锁VMware支持macOS安装](https://blog.csdn.net/hubing_hust/article/details/128596690#VMwaremacOS_32)
  - - [2.1 关闭已经打开的VMware软件](https://blog.csdn.net/hubing_hust/article/details/128596690#21_VMware_34)
    - [2.2 安装VMware Workstation Unlocker](https://blog.csdn.net/hubing_hust/article/details/128596690#22_VMware_Workstation_Unlocker_40)
  - [三、VMware创建虚拟机](https://blog.csdn.net/hubing_hust/article/details/128596690#VMware_50)
  - - [3.1 解压缩macOS的安装包](https://blog.csdn.net/hubing_hust/article/details/128596690#31_macOS_52)
    - [3.2 新建macOS的虚拟机](https://blog.csdn.net/hubing_hust/article/details/128596690#32_macOS_58)
  - [四、安装macOS虚拟机](https://blog.csdn.net/hubing_hust/article/details/128596690#macOS_116)
  - - [4.1 选择CD/DVD](https://blog.csdn.net/hubing_hust/article/details/128596690#41_CDDVD_118)
    - [4.2 开始安装](https://blog.csdn.net/hubing_hust/article/details/128596690#42__124)
    - [4.3 配置系统](https://blog.csdn.net/hubing_hust/article/details/128596690#43__170)

  

  # 一、准备工作

  现实中，银子足够的话，买一台真实的Apple笔记本也是极好的，但未必每个人都有这个必要，通过安装一台macOS的虚拟机，来做一些实验性质的活动，也未尝不是一个好方法。

  下面就开始着手安装吧~

  ## 1.1 安装 VMware

  首先你得把虚拟机软件VMware装上，才能有后面的一切。

  VMware的官网为 https://www.vmware.com/cn/products/workstation-pro.html

  下载并安装即可，激活码网上有很多。

  ![20230107220415](https://img-blog.csdnimg.cn/img_convert/46466c9b387ec8216985719edb3277fa.png)

  ## 1.2 下载macOS的安装包

  我这里提供一个macOS 11.0.1 的包，解压后是[cdr](https://so.csdn.net/so/search?q=cdr&spm=1001.2101.3001.7020)格式的，也可以自行下载其他版本的包，ios格式的也可以，下载后备用。

  链接: https://pan.baidu.com/s/1GN8_4LCY2e0zM1lqeTna5w?pwd=1234 提取码: 1234 复制这段内容后打开百度网盘手机App，操作更方便哦
  –来自百度网盘超级会员v6的分享

  ## 1.3 下载VMware虚拟机解锁安装苹果系统工具

  Unlocker 4.2.4 下载
  https://www.mfpud.com/topics/11469/

  选择百度网盘下载：
  ![20230107220715](https://img-blog.csdnimg.cn/img_convert/14e8ae31e1e9fa53f6a31618e6093027.png)

  # 二、解锁VMware支持macOS安装

  ## 2.1 关闭已经打开的VMware软件

  如果已经打开了VMware，需要先将其关闭，否则后续安装 Unlocker的时候也会失败，提示你关闭。

  ![20230107220821](https://img-blog.csdnimg.cn/img_convert/e00fcd34d82dd00f030e80793448d83b.png)

  ## 2.2 安装VMware Workstation Unlocker

  下载后是个压缩包unlocker424.zip，下载完成后解压缩即可。
  打开其中的windows文件夹
  ![20230107220921](https://img-blog.csdnimg.cn/img_convert/22e4d3e64a0cbac85987df3085309921.png)

  双击执行unlock.exe，运行成功的话即可解锁VMware，使其支持macOS的安装。

  ![20230107220952](https://img-blog.csdnimg.cn/img_convert/017f1aa5c4cbe8329f4d16fd17a085ca.png)

  # 三、VMware创建虚拟机

  ## 3.1 解压缩macOS的安装包

  将前面下载的macOS解压缩为cdr格式的安装包，当然如果你有其他版本的macos ISO安装包也可以，不论是这里的cdr还是ISO格式的，VMware都是可以安装的。

  ![20230107221111](https://img-blog.csdnimg.cn/img_convert/5ae8f2cbf6e3c29ae9ba8970eb68ab4a.png)

  ## 3.2 新建macOS的虚拟机

  打开VMware软件，[新建虚拟机](https://so.csdn.net/so/search?q=新建虚拟机&spm=1001.2101.3001.7020)，选择自定义，然后下一步

  ![20230107221216](https://img-blog.csdnimg.cn/img_convert/c49c43bffa8b7488453732f81455e362.png)

  ![20230107221228](https://img-blog.csdnimg.cn/img_convert/10a847d61b89220b57c8b08ca5e9cd34.png)

  ![20230107221242](https://img-blog.csdnimg.cn/img_convert/cbb285e63eda899261e60776385528da.png)

  选择稍后安装操作系统

  ![20230107221312](https://img-blog.csdnimg.cn/img_convert/8db9e820c357569bb0eaf4deed9fedc8.png)

  选择Apple macOS，版本选择macOS 11（我提供的包是11版本，根据自己的情况来）

  ![20230107221402](https://img-blog.csdnimg.cn/img_convert/cfac3a760ad026111492239e400887de.png)

  虚拟机名字自己取，并选择一个合适的安装位置，磁盘空间最好要大点，因为推荐的大小是80GB

  ![20230107221431](https://img-blog.csdnimg.cn/img_convert/9a6470088428f1f036aeb968d16370d8.png)

  选择合适的处理器配置，我这里是1个cpu 4个core

  ![20230107221458](https://img-blog.csdnimg.cn/img_convert/5a2d4c5c6b45a3e69b86c8852b7fa1fa.png)

  内存多多益善，我的机器是16GB内存，这里分配8GB给它

  ![20230107221524](https://img-blog.csdnimg.cn/img_convert/61e2e6b203d34d0c80484eee0e627186.png)

  网络类型默认NAT即可

  ![20230107221546](https://img-blog.csdnimg.cn/img_convert/49065f8531e941eb0fc9fffa8598e5c2.png)

  I/O控制器类型默认即可

  ![20230107221605](https://img-blog.csdnimg.cn/img_convert/d69b7895f937f3e17ef73d2d840a0015.png)

  磁盘类型默认即可

  ![20230107221632](https://img-blog.csdnimg.cn/img_convert/b44ebccc15269e829777002aa8332561.png)

  选择创建新虚拟磁盘

  ![20230107221655](https://img-blog.csdnimg.cn/img_convert/72a9cea45cc6c24019b7e88e363fb186.png)

  磁盘大小默认80GB, 不能太小，选择存储为单个文件以提升性能

  ![20230107221731](https://img-blog.csdnimg.cn/img_convert/d747ea367038fa46f11fc1a407900e0e.png)

  磁盘文件名称默认即可

  ![20230107221750](https://img-blog.csdnimg.cn/img_convert/2137713db70074205bfda29a56163f08.png)

  单击完成，结束虚拟机的创建

  ![20230107221807](https://img-blog.csdnimg.cn/img_convert/26ade986f9e3aab1f7f755280afea06c.png)

  # 四、安装macOS虚拟机

  ## 4.1 选择CD/DVD

  选择CD驱动器，ISO文件选择我们刚刚解压缩后的cdr格式文件，或者你自己的其他版本的ISO格式文件也行

  ![20230107221917](https://img-blog.csdnimg.cn/img_convert/2d68b1394931144cccb346dbb2a8b73f.png)

  ## 4.2 开始安装

  点击开启虚拟机，开始安装

  ![20230107222006](https://img-blog.csdnimg.cn/img_convert/6afaf95b2f5f15df09236b2b8144d613.png)

  几分钟后，会让你选择语言，选择简体中文即可

  ![20230107222033](https://img-blog.csdnimg.cn/img_convert/b7c20d9facc4043846850175e351ee01.png)

  选择磁盘工具，然后点击继续

  ![20230107222112](https://img-blog.csdnimg.cn/img_convert/714d4f53f40a99986e5d75bbf921d9ce.png)

  选择最上面那个磁盘，它是未初始化的状态，然后点击抹掉，将其格式化

  ![20230107222226](https://img-blog.csdnimg.cn/img_convert/70391abbc2c0403a9e467c641b5a818c.png)

  弹出的窗口中，名字随便起一个，然后点击抹掉

  ![20230107222301](https://img-blog.csdnimg.cn/img_convert/cbbf6b0cc0aa9bf83b48fe42ec30444b.png)

  完成后，关闭当前窗口

  ![20230107222329](https://img-blog.csdnimg.cn/img_convert/1245f6b8465301693a8cb63f0f87054e.png)

  ![20230107222345](https://img-blog.csdnimg.cn/img_convert/a0dbc156755de27b7176bf83f3cb4a16.png)

  选择安装 macOS Big Sur，然后点击继续

  ![20230107222421](https://img-blog.csdnimg.cn/img_convert/8c65b21586d8ad9b4269451af32bbf4c.png)

  一路继续

  ![20230107222451](https://img-blog.csdnimg.cn/img_convert/d7a96ca299fa059e308107a00abc6d92.png)

  ![20230107222507](https://img-blog.csdnimg.cn/img_convert/88cf35e4b6c300cd199a5d9adc542c5c.png)

  选择磁盘，点击继续

  ![20230107222531](https://img-blog.csdnimg.cn/img_convert/5e2b28f74a2995cb963896c00b6abb92.png)

  开始进入漫长的安装过程，耐心等待

  ![20230107222604](https://img-blog.csdnimg.cn/img_convert/9457f9e01d2c6a69d5107b30353e0648.png)

  ## 4.3 配置系统

  安装进度结束后，会开启配置过程，我们按需配置即可。

  选择中国大陆

  ![20230107222706](https://img-blog.csdnimg.cn/img_convert/e3e366b8f416d2e1dc946f71b7ad1d6e.png)

  输入法这里直接默认，点击继续

  ![20230107222733](https://img-blog.csdnimg.cn/img_convert/2fb05db6a815a7df5503c673a71c2b34.png)

  辅助功能也跳过，点击以后

  ![20230107222757](https://img-blog.csdnimg.cn/img_convert/641d57cfca6e28b728b57aa242d0a7f0.png)

  数据与隐私直接点继续

  ![20230107222818](https://img-blog.csdnimg.cn/img_convert/578434557de0c045f32f46006aeefdec.png)

  数据迁移 点击 以后

  ![20230107222839](https://img-blog.csdnimg.cn/img_convert/4a168c02ba922951aab17e2a317f85de.png)

  有Apple ID的话这里可以选择登录，也可以选稍后设置

  ![20230107222907](https://img-blog.csdnimg.cn/img_convert/507cb9337dc91d0fd9081b69231cf18f.png)

  如果进行登录的话，这里会需要验证

  ![20230107222935](https://img-blog.csdnimg.cn/img_convert/d15bd706580d2d6654e3c491f57fe50c.png)

  ![20230107222953](https://img-blog.csdnimg.cn/img_convert/6439241b86f19c0dbfed18f39c4f840d.png)

  配置电脑登录的账户和密码

  ![20230107223019](https://img-blog.csdnimg.cn/img_convert/9f3e471d47a1b2cb7bb55c6e2f1b35ee.png)

  开始配置账户，稍等片刻

  ![20230107223041](https://img-blog.csdnimg.cn/img_convert/006f6da4a40f42af3383881fbbd108ca.png)

  钥匙串选择稍后设置

  ![20230107223059](https://img-blog.csdnimg.cn/img_convert/48a47814d8397b0a158b159c7f577f45.png)

  快捷设置直接点继续

  ![20230107223118](https://img-blog.csdnimg.cn/img_convert/573c418dabe51d5adec148eb83d43e5b.png)

  直接继续

  ![20230107223135](https://img-blog.csdnimg.cn/img_convert/21cb712dcd9d19e3e60b477472e1611c.png)

  无关紧要的都可以稍后设置

  ![20230107223154](https://img-blog.csdnimg.cn/img_convert/190357a1da60a3f63e93a64d96c95997.png)

  由于是虚拟机，siri无实际用处，去掉勾选

  ![20230107223216](https://img-blog.csdnimg.cn/img_convert/1211db560f619cb10e2cda4f49865102.png)

  选择外观后继续

  ![20230107223236](https://img-blog.csdnimg.cn/img_convert/faa3782046c262719f46b11f8e8f371c.png)

  成功进入桌面，此时桌面还不是全屏

  ![20230107223301](https://img-blog.csdnimg.cn/img_convert/317ca24b4704a29919c8595d095fabd0.png)

  现在开始桌面全屏，在桌面右上角，右键单击光盘图标，选择推出光盘

  ![20230107223351](https://img-blog.csdnimg.cn/img_convert/e9aadb0182f855939d7900309fa0734c.png)

  返回到虚拟机窗口，安装Vmware tool，这个tool安装完毕后，mac的桌面就可以自适应屏幕窗口大小了

  ![20230107223447](https://img-blog.csdnimg.cn/img_convert/3259f99026e4088194a1d9c58d3f2a1b.png)

  双击打开安装窗口

  ![20230107223517](https://img-blog.csdnimg.cn/img_convert/dcddccef3c7554ebaddaff9a8b1e3d4c.png)

  依次点击 继续和安装，安装位置保持默认就行

  ![20230107223811](https://img-blog.csdnimg.cn/img_convert/e3154557af85bb29e52553d623f129d2.png)

  输入刚刚配置的账号密码，确认安装

  ![20230107224006](https://img-blog.csdnimg.cn/img_convert/73b3735efa7ecc403d478bd2c0d846e8.png)

  此时会弹出系统扩展已被阻止的提示，点击打开安全性偏好设置，然后点击锁按钮，再点击允许。

  ![20230107224713](https://img-blog.csdnimg.cn/img_convert/03bc115b6d0ad2cb3d7c67848f9b2e61.png)

  不立即重新启动，点击以后，并关闭安全性与隐私窗口

  ![20230107224253](https://img-blog.csdnimg.cn/img_convert/9b56fc900c25be6f71b8ec5a07a90672.png)

  返回安装Vmware tools的窗口，在这里点击重启

  ![20230107224409](https://img-blog.csdnimg.cn/img_convert/16d4f180d0d264fe85557837da50b4b5.png)

  重启后你会发现屏幕已经可以全屏了

  ![20230107224548](https://img-blog.csdnimg.cn/img_convert/200ce3071e0696124aaf3b7ddb9039db.png)

  至此安装完毕。enjoy yourself！

  [![img](https://profile-avatar.csdnimg.cn/6a1c6d517c1c475f9f190b2d07a85d52_hubing_hust.jpg!1)smart_cat](https://blog.csdn.net/hubing_hust)

  [已关注](javascript:;)

  - ![img](https://csdnimg.cn/release/blogv2/dist/pc/img/newHeart2021Black.png)6
  - ![img](https://csdnimg.cn/release/blogv2/dist/pc/img/newUnHeart2021Black.png)
  - [![img](https://csdnimg.cn/release/blogv2/dist/pc/img/newCollectBlack.png)15](javascript:;)
  - [![打赏](https://csdnimg.cn/release/blogv2/dist/pc/img/newRewardBlack.png)](javascript:;)
  - ![img](https://csdnimg.cn/release/blogv2/dist/pc/img/newComment2021Black.png)1
  - 
  - [![img](https://csdnimg.cn/release/blogv2/dist/pc/img/newShareBlack.png)](javascript:;)

  专栏目录

  [*VMware**安装**macOS*](https://download.csdn.net/download/weixin_38705640/14038010)

  01-07

  [*VMware* *安装* *Mac* OS 相关问题 工具 *VMware* Workstations 14/15（建议） *MacOS* 10.13 镜像 *macOS* High Sierra unlocker：*VMware* 插件，支持 *macOS* *安装* unlocker*安装* 解压文件夹，管理员运行 文件 win-install.cmd 自动完成。如果出现错误可能需要 Python 2.7 的环境，或者手动关闭 *VMware* 相关服务。 创建*虚拟机* 选择 *macOS* 镜像光盘 客户机操作系统选择新出现的 Apple *Mac* OS X 创建好*虚拟机*之后，进入*安装*位置，编辑 *macOS* 10.13.vmx，在 sm](https://download.csdn.net/download/weixin_38705640/14038010)

  [*windows**虚拟机**安装**Mac* OS系统（操作图解）](https://blog.csdn.net/dm569263708/article/details/130523282)

  [dm569263708的专栏](https://blog.csdn.net/dm569263708)

  ![img](https://csdnimg.cn/release/blogv2/dist/pc/img/readCountWhite.png) 961

  [*windows*系统*使用**VMWare*16 pro *安装**MacOS*](https://blog.csdn.net/dm569263708/article/details/130523282)

  

  1 条评论

  [![img](https://profile-avatar.csdnimg.cn/default.jpg!1)A̶ɴ̶ɢ̶ʟ̶ᴇ̶ʀ̶751](https://blog.csdn.net/qq_74959665)热评

  亲测可以！感谢博主！

  写评论

  [window10*安装**Mac**虚拟机*详细教程_*mac**虚拟机**安装*教程win10_Spring_Year...](https://blog.csdn.net/qq_45025572/article/details/108689543)

  7-19

  [1、首先打开*VMware*在界面点击创建新的*虚拟机*或者*使用*快捷键Ctrl+N进行创建 2、在新建*虚拟机*向导窗口中选择"自定义(高级)"并点击下一步 3、直接点击下一步 4、在新建*虚拟机*向导中选择“稍后*安装*操作系统”并点击下一步 5、选择Apple ...](https://blog.csdn.net/qq_45025572/article/details/108689543)

  [*Windows**使用**VMware* *安装**macOS**虚拟机*_*windows**安装**mac**虚拟机*_m0...](https://blog.csdn.net/m0_52067452/article/details/129206753)

  7-17

  [1)选择稍后*安装*操作系统 2)选择*macOS**虚拟机* 3)选择合适的*安装*位置 其余默认 即可新建*虚拟机* 4)(仅AMD处理器需要添加)打开*虚拟机*文件位置*使用*文本工具打开vmx文件在最后添加如下代码,保存退出。](https://blog.csdn.net/m0_52067452/article/details/129206753)

  [Win10*安装**mac**虚拟机*](https://blog.csdn.net/weixin_44412226/article/details/131064024)

  [weixin_44412226的博客](https://blog.csdn.net/weixin_44412226)

  ![img](https://csdnimg.cn/release/blogv2/dist/pc/img/readCountWhite.png) 351

  [所以可以推测出该文件采用的是SHA-256哈希算法（64*4=256）。由于百度网盘下载大文件有一定概率损坏文件，文件损坏后导致用户在*安装*部署时可能失败。所以必须核对文件的哈希值。由上图可知，SHA-2包含的算法不只一种，例如SHA-256、SHA-384或SHA-512。按照上面的参考文章进行了*安装*并完成了*安装*，结合*安装*过程中遇到的问题，进行一个总结。（2）*mac**虚拟机*：可以直接采用参考文章的*虚拟机*。（1）*虚拟机*平台：用来装载*mac**虚拟机*。参考文章中提到需要验证SHA-2。](https://blog.csdn.net/weixin_44412226/article/details/131064024)

  [*windows*下在*虚拟机*里*安装**MAC*系统](https://download.csdn.net/download/mo7mo/4468861)

  08-01

  [这两天一直在研究怎么在*虚拟机*里边完美的*安装**Mac*系统，因为学的是*ios**开发*，自己的电脑又是*windows*的系统，这样没法学习，所以在网上搜遍了资料，然后又结合自己的电脑实际用了几天时间终于*安装*了下来，其实*安装*了之后才发现，这件事情是比较简单的，在此谢了文档配合图片，保证你能很快的在*虚拟机*里边轻松的*安装**Mac*,然后就省了很多事尽情的做*ios**开发*把！](https://download.csdn.net/download/mo7mo/4468861)

  [*Windows*下*虚拟机**安装**Mac* OS X —– VM12*安装**Mac* OS X 10.11_DauntLess_F...](https://blog.csdn.net/u013022210/article/details/85159167)

  7-16

  [*Mac* OS X 10.11 镜像文件下载 提取密码是dqbi unlocker208文件下载地址 提取密码是b2ac VM可自行百度下载,本文中用的是VM12 二、基本步骤 1.首先下载 *vmware* workstation,以管理员身份运行,*安装*点击下一步即可。注册码百度一堆。](https://blog.csdn.net/u013022210/article/details/85159167)

  [*Windows*操作系统下*安装**MAC* OS系统*虚拟机*_weixin_34409741的博客-CSDN...](https://blog.csdn.net/weixin_34409741/article/details/90336235)

  7-5

  [1、*安装**VMware* Workstation。 2、下载*MAC* OS镜像(.cdr文件) 3、下载unlocker206 注:以上资源可百度、谷歌搜索进行下载。(如果未找到资源,请下面评论,谢谢合作) 4、确保*VMware**虚拟机*完全关闭的情况下,以管理员身份运行unlock206文件中的...](https://blog.csdn.net/weixin_34409741/article/details/90336235)

  [*MacOs*10.14.4 *Vmware* *虚拟机*镜像文件](https://download.csdn.net/download/sunshinefly87/11088251)

  04-04

  [*VMware* Workstation Pro *虚拟机*+ *MacOs* 10.14.4最新版苹果系统懒人版镜像 一键部署](https://download.csdn.net/download/sunshinefly87/11088251)

  [在*Windows*系统上*安装**MacOS**虚拟机*](https://blog.csdn.net/pxsbxzw/article/details/125323249)

  [pxsbxzw的博客](https://blog.csdn.net/pxsbxzw)

  ![img](https://csdnimg.cn/release/blogv2/dist/pc/img/readCountWhite.png) 1万+

  [在*Windows*上*安装**MacOS**虚拟机*，准备工作主要分三个方面：电脑配置、*MacOS*镜像和*虚拟机*软件。](https://blog.csdn.net/pxsbxzw/article/details/125323249)

  [*Windows*系统*安装**mac**虚拟机*教程及问题解决_π丧我不丧的博客](https://blog.csdn.net/weixin_46023159/article/details/105943314)

  7-14

  [我这里提供两个亲测有效的*mac*镜像下载,iso格式点击下载,提取码o5qk。cdr格式点击下载,提取码8yu6(二者选一即可) *安装*教程: *VMware**安装*流程: *安装*完*VMware*不要急着打开,先将下载的black phone压缩包解压,打开目录找到win-install.cmd文...](https://blog.csdn.net/weixin_46023159/article/details/105943314)

  [保姆式教你在Win10系统下*安装**Mac**虚拟机*_win10模拟*mac*_一只即将拥有马甲...](https://blog.csdn.net/JUST__LYY/article/details/118028929)

  7-10

  [保姆式教你在Win10系统下*安装**Mac**虚拟机* 一、*虚拟机*介绍 *VMware*Player可以在单个计算机上运行第二个(不同)操作系统。即可以让你在*Windows*上运行*Mac**虚拟机*。 你可以将桌面与设备隔离,并在原始操作系统上启用剪切和粘贴以及共享文件夹功能。](https://blog.csdn.net/JUST__LYY/article/details/118028929)

  [*Windows*系统*使用*VM*安装**mac*教程](https://blog.csdn.net/wen_wen_1/article/details/99693340)

  [wen_wen_1的博客](https://blog.csdn.net/wen_wen_1)

  ![img](https://csdnimg.cn/release/blogv2/dist/pc/img/readCountWhite.png) 8594

  [*Windows*系统*使用*VM*安装**mac*教程 接触*虚拟机*有段时间了，考虑到自己还未玩过*mac*系统。 前这篇教程前，有位少女说你的*mac*和我所知道的*mac*肯定不一样~ 接下来就是本人一些的经历和所遇到的问题，欢迎提出不足 首先需要用到的工具： VM*虚拟机*链接：https://pan.baidu.com/s/1gArh4rZ07DUNBRK0waJFSA 提取码：pcv7 *macOS* 10.13 CDR...](https://blog.csdn.net/wen_wen_1/article/details/99693340)

  [给*windows*装个*Mac*黑苹果*虚拟机*](https://huaweicloud.csdn.net/63563c27d3efff3090b5ba5f.html)

  [协议分析与还原](https://blog.csdn.net/yeyiqun)

  ![img](https://csdnimg.cn/release/blogv2/dist/pc/img/readCountWhite.png) 6083

  [点击上方↑↑↑蓝字[协议分析与还原\]关注我们“*windows*下*安装**使用*苹果*Mac**虚拟机*。”平常的生活工作中，我大部分时候*使用**Windows*，偶尔用用*Mac*。实在是用不惯*Mac*，但有的时候...](https://huaweicloud.csdn.net/63563c27d3efff3090b5ba5f.html)

  [*Windows**安装**Mac*10.13*虚拟机*](https://blog.csdn.net/VIMQQZS/article/details/108184626)

  [VIMQQZS的博客](https://blog.csdn.net/VIMQQZS)

  ![img](https://csdnimg.cn/release/blogv2/dist/pc/img/readCountWhite.png) 254

  [下载*VMware* 如果是15.5版本以上，选择unlock时选择3.03版本以上 如果能*安装*，等的起可以*使用*win-install 等不起可以先关闭*VMware* 在浏览器上输入http://softwareupdate.*vmware*.com/cds/vmw-desktop/fusion/11.5.1/15018442/core/ 可以下载com.*vmware*.fusion.zip.tar文件 解压找到\com.*vmware*.fusion.zip.tar\com.*vmware*.fusion.zip\paylo](https://blog.csdn.net/VIMQQZS/article/details/108184626)

  [在*VMware*上*安装**macOS*](https://blog.csdn.net/CGydicjxy/article/details/128425957)

  [CGydicjxy的博客](https://blog.csdn.net/CGydicjxy)

  ![img](https://csdnimg.cn/release/blogv2/dist/pc/img/readCountWhite.png) 1039

  [选择*macOS*版本，小编为了方便，就选择10.13的版本。文末的镜像我会提供10.13，12，13的版本，大家根据实际需求选择。下一步要注意，网络一定要关，否则*安装*界面会卡在16分钟。此时在*虚拟机*内，右击桌面上的光盘，选择“推出······”，便可*安装*vmTloos。打开目录后，把后缀名为.vmx的文件用记事本打开，在最后添加这样一串代码，保存。vmTloos软件包脚本可能会被拦截，在设置里面允许，再重新*安装*。开启之前，先要检查cpu虚拟化有没有开启，检查方式如下图。点击中国，选择接近你家的城市，继续。](https://blog.csdn.net/CGydicjxy/article/details/128425957)

  [*Windows* *VMware* 装 *macOS* 全网最详细](https://blog.csdn.net/m0_72983309/article/details/126003519)

  [m0_72983309的博客](https://blog.csdn.net/m0_72983309)

  ![img](https://csdnimg.cn/release/blogv2/dist/pc/img/readCountWhite.png) 2711

  [还在苦于想要体验*Mac*却经费不足的情况吗😛 如果你有一台*Windows* PC ，现在装个*macOS*简直不要太简单！🤪🤪（全网最详细） ⚠️⚠️准备工作： 1.*Windows* PC一台(Win 7/8/10/11皆可)🥰🥰 2. 下载*VMware*Workstation。 链接 🔗*vmware*.com/cn/products/workstation-pro/workstation-pro-evaluation.html 3.Unlocker解锁工具。链接 🔗 4.......](https://blog.csdn.net/m0_72983309/article/details/126003519)

  [*windows**使用**虚拟机**安装**mac*系统](https://blog.csdn.net/ss810540895/article/details/127104379)

  [ss810540895的博客](https://blog.csdn.net/ss810540895)

  ![img](https://csdnimg.cn/release/blogv2/dist/pc/img/readCountWhite.png) 6408

  [下载unlocker-3.0.8，解压后以管理员身份运行win-install.cmd，然后重启*vmware*即可（因阿里云盘不可分享该文件，可留言）点击链接保存，或者复制本段内容，打开「阿里云盘」APP ，无需下载极速在线查看，视频原画倍速播放。26.选择刚才抹掉格式化的那块名称为new的80G虚拟磁盘，继续。21.选第一个，也就是开始创建的80G虚拟磁盘空间，再点击抹掉。28.然后几个初始化设置，也可跳过，*安装*完成后就会看到如下界面。23.完成后关闭，回到如下界面，选择第二个。20.选择磁盘工具，继续。](https://blog.csdn.net/ss810540895/article/details/127104379)

  [Window*安装**Mac**虚拟机*](https://blog.csdn.net/yufumatou/article/details/105979031)

  [yufumatou的博客](https://blog.csdn.net/yufumatou)

  ![img](https://csdnimg.cn/release/blogv2/dist/pc/img/readCountWhite.png) 4111

  [前言：在学习flutter过程中，要在*iOS*上运行程序，考虑到没有真机，只能用模拟器，然而window系统没有找到*iOS*相关模拟器，于是在window上*安装**Mac**虚拟机*。 一、*安装**VMware* 官方下载地址：https://my.*vmware*.com/cn/web/*vmware*/downloads 许可证密钥：CG392-4PX5J-H816Z-HYZNG-PQRG2 二、解锁VMwa...](https://blog.csdn.net/yufumatou/article/details/105979031)

  [*Windows*下*VMware* Workstations Pro15.5.0*安装**macOS* Catalina 10.15*虚拟机*（详细教程）](https://download.csdn.net/download/weixin_38538224/14036888)

  01-07

  [第一步：*安装**VMware* Workstations Pro15.5.0 并且*安装*对应版本的Unlock，支持Catalina 10.15黑苹果系统。 请参考我的博客 *Windows*1903*安装**VMware* Workstations Pro15.1.0并解锁Unlock3.0.2 里面已经更新了最新支持Catalina 10.15的Unlock文件！ 第二步：制作cdr镜像（*mac*环境） 制作教程参考我的博客： 黑苹果 制作*虚拟机*CDR镜像（最详细的教程！） cdr镜像：\color{red}cdr镜像：cdr镜像：链接: https://pan.baidu.com/s/1nn7tMsZjzPb](https://download.csdn.net/download/weixin_38538224/14036888)

  [*vmware* *虚拟机**安装**macos* 启动软件](https://download.csdn.net/download/airport135/8366233)

  01-15

  [用于*vmware**虚拟机**安装**macos*系统的启动和引导软件。](https://download.csdn.net/download/airport135/8366233)

  [VM*虚拟机*怎么*安装**mac* os？（全教程）最新发布](https://blog.csdn.net/qq_64039239/article/details/131394404)

  [qq_64039239的博客](https://blog.csdn.net/qq_64039239)

  ![img](https://csdnimg.cn/release/blogv2/dist/pc/img/readCountWhite.png) 1221

  [*windows*上的*虚拟机**安装**mac* 13，保姆级教程](https://blog.csdn.net/qq_64039239/article/details/131394404)

  [教你如何在*windows*系统的*虚拟机*环境下*安装*苹果系统热门推荐](https://blog.csdn.net/tanshengjunjun/article/details/78420500)

  [谭声俊的博客](https://blog.csdn.net/tanshengjunjun)

  ![img](https://csdnimg.cn/release/blogv2/dist/pc/img/readCountWhite.png) 2万+

  [教你如何在*windows*系统的*虚拟机*环境下*安装*苹果系统 谭声俊 1 年前 2016.10.28记录 前些天，移动计算导论课需要我们在OS系统上做*IOS*的UI界面设计,我的电脑是宏碁*windows*8.1系统，无法很好地*使用*OS系统独有的软件xcode7.0。 解决方案：1.在*虚拟机**vmware* workstation下*安装*苹果os系统 2.在硬盘分出一个区*安装*苹果os和*Windows*...](https://blog.csdn.net/tanshengjunjun/article/details/78420500)

  [*Windows* 10电脑*使用**VMware**虚拟机**安装**macOS*苹果系统[一站式保姆级别教程\]](https://blog.csdn.net/viviwa/article/details/128485019)

  [viviwa的博客](https://blog.csdn.net/viviwa)

  ![img](https://csdnimg.cn/release/blogv2/dist/pc/img/readCountWhite.png) 2122

  [indows系统下*使用**VMware**虚拟机**安装**macOS*苹果系统保姆级别教程，根据本教程操作可以轻松实现win系统*安装**macOS* Mojav 10.14、*macOS* Catalina 10.15、*macOS* big sur 11、*macOS* Monterey 12、*macOS* Ventura 13*虚拟机*专用系统。](https://blog.csdn.net/viviwa/article/details/128485019)

  [window10*安装**Mac**虚拟机*详细教程](https://blog.csdn.net/m0_37995916/article/details/124104397)

  [m0_37995916的博客](https://blog.csdn.net/m0_37995916)

  ![img](https://csdnimg.cn/release/blogv2/dist/pc/img/readCountWhite.png) 903

  [详见：https://blog.csdn.net/qq_45025572/article/details/108689543](https://blog.csdn.net/m0_37995916/article/details/124104397)

  [*vmware**安装**macos*](https://wenku.csdn.net/answer/88a66140e7ad11edbcb5fa163eeb3507)

  05-01

  [*VMware*是一个用于托管多个*虚拟机*的软件，可以在其中运行不同的操作系统。如果你想要在*VMware*中*安装**MacOS*，则需要遵循以下步骤： 1. 准备工作：需要一台支持虚拟化技术的电脑，并且*安装*好*VMware*软件和*MacOS*镜像文件。 2. 创建*虚拟机*：打开*VMware*软件，点击“新建*虚拟机*”，选择“自定义（高级）”，按照提示设置*虚拟机*名称、硬件配置等。 3. *安装**MacOS*：将*MacOS*镜像文件挂载到*虚拟机*上，启动*虚拟机*，进入*安装*过程。按照提示进行*安装*，选择合适的*安装*模式（全新*安装*、升级等）。 4. *安装**VMware*工具：*安装*完成后，需要在*MacOS*里面*安装**VMware*工具，以便充分利用*虚拟机*的功能。 总的来说，*安装**MacOS**虚拟机*需要注意以下几点： 1. *虚拟机*的硬件配置要足够强大，以满足*MacOS*的运行要求。 2. *安装**MacOS*的过程可能比较复杂，需要仔细阅读*安装*提示。 3. *安装**VMware*工具后，可能需要调整*MacOS*的显示分辨率或其他设置，以保证*虚拟机*的显示效果最佳。 4. *Mac* OS*虚拟机*的合法性存在争议，需要谨慎*使用*。](https://wenku.csdn.net/answer/88a66140e7ad11edbcb5fa163eeb3507)

  ### “相关推荐”对你有帮助么？

  - ![img](https://csdnimg.cn/release/blogv2/dist/pc/img/npsFeel1.png)

    非常没帮助

  - ![img](https://csdnimg.cn/release/blogv2/dist/pc/img/npsFeel2.png)

    没帮助

  - ![img](https://csdnimg.cn/release/blogv2/dist/pc/img/npsFeel3.png)

    一般

  - ![img](https://csdnimg.cn/release/blogv2/dist/pc/img/npsFeel4.png)

    有帮助

  - ![img](https://csdnimg.cn/release/blogv2/dist/pc/img/npsFeel5.png)

    非常有帮助

  - [关于我们](https://www.csdn.net/company/index.html#about)
  - [招贤纳士](https://www.csdn.net/company/index.html#recruit)
  - [商务合作](https://marketing.csdn.net/questions/Q2202181741262323995)
  - [寻求报道](https://marketing.csdn.net/questions/Q2202181748074189855)
  - ![img](https://g.csdnimg.cn/common/csdn-footer/images/tel.png)400-660-0108
  - ![img](https://g.csdnimg.cn/common/csdn-footer/images/email.png)[kefu@csdn.net](mailto:webmaster@csdn.net)
  - ![img](https://g.csdnimg.cn/common/csdn-footer/images/cs.png)[在线客服](https://csdn.s2.udesk.cn/im_client/?web_plugin_id=29181)
  - 工作时间 8:30-22:00

  - [公安备案号11010502030143](http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=11010502030143)
  - [京ICP备19004658号](http://beian.miit.gov.cn/publish/query/indexFirst.action)
  - [京网文〔2020〕1039-165号](https://csdnimg.cn/release/live_fe/culture_license.png)
  - [经营性网站备案信息](https://csdnimg.cn/cdn/content-toolbar/csdn-ICP.png)
  - [北京互联网违法和不良信息举报中心](http://www.bjjubao.org/)
  - [家长监护](https://download.csdn.net/tutelage/home)
  - [网络110报警服务](http://www.cyberpolice.cn/)
  - [中国互联网举报中心](http://www.12377.cn/)
  - [Chrome商店下载](https://chrome.google.com/webstore/detail/csdn开发者助手/kfkdboecolemdjodhmhmcibjocfopejo?hl=zh-CN)
  - [账号管理规范](https://blog.csdn.net/blogdevteam/article/details/126135357)
  - [版权与免责声明](https://www.csdn.net/company/index.html#statement)
  - [版权申诉](https://blog.csdn.net/blogdevteam/article/details/90369522)
  - [出版物许可证](https://img-home.csdnimg.cn/images/20220705052819.png)
  - [营业执照](https://img-home.csdnimg.cn/images/20210414021142.jpg)
  - ©1999-2023北京创新乐知网络技术有限公司

  [![img](https://profile-avatar.csdnimg.cn/6a1c6d517c1c475f9f190b2d07a85d52_hubing_hust.jpg!1)](https://blog.csdn.net/hubing_hust)

  [smart_cat](https://blog.csdn.net/hubing_hust)

  码龄13年[![img](https://csdnimg.cn/identity/nocErtification.png) 暂无认证](https://i.csdn.net/#/uc/profile?utm_source=14998968)

  

  

  

  - 167万+

    访问

  - [![img](https://csdnimg.cn/identity/blog5.png)](https://blog.csdn.net/blogdevteam/article/details/103478461)

    等级

  - 1938

    积分

  - 2万+

    粉丝

  - 274

    获赞

  - 37

    评论

  - 911

    收藏

  ![授人以渔](https://csdnimg.cn/53a3e1cbc8b643cd88e0be2ea68200f7.png)

  ![笔耕不辍](https://csdnimg.cn/70592b2299594e37aedcaa91fc52a294.png)

  ![创作能手](https://csdnimg.cn/medal/qixiebiaobing4@240.png)

  ![知无不言](https://csdnimg.cn/f19b84c244aa4e6d8bf469b4aff1f98c.png)

  [私信](https://im.csdn.net/chat/hubing_hust)

  已关注

  ![img](https://csdnimg.cn/cdn/content-toolbar/csdn-sou.png?v=1587021042)

  ### 热门文章

  - [pip 如何设置代理 ![img](https://csdnimg.cn/release/blogv2/dist/pc/img/readCountWhite.png) 25478](https://blog.csdn.net/hubing_hust/article/details/127994734)
  - [Python使用Selenium WebDriver的入门介绍及安装教程 ![img](https://csdnimg.cn/release/blogv2/dist/pc/img/readCountWhite.png) 22879](https://blog.csdn.net/hubing_hust/article/details/128295216)
  - [13. PyQt5实现多页面切换之QTabWidget ![img](https://csdnimg.cn/release/blogv2/dist/pc/img/readCountWhite.png) 22873](https://blog.csdn.net/hubing_hust/article/details/127951915)
  - [python 解析库Beautiful Soup的安装 ![img](https://csdnimg.cn/release/blogv2/dist/pc/img/readCountWhite.png) 21839](https://blog.csdn.net/hubing_hust/article/details/128278550)
  - [python基础-生成器表达式 ![img](https://csdnimg.cn/release/blogv2/dist/pc/img/readCountWhite.png) 19939](https://blog.csdn.net/hubing_hust/article/details/127881499)

  ### 分类专栏

  - ![img](https://img-blog.csdnimg.cn/20201014180756930.png?x-oss-process=image/resize,m_fixed,h_64,w_64)microsoft

    1篇

  - ![img](https://img-blog.csdnimg.cn/20201014180756930.png?x-oss-process=image/resize,m_fixed,h_64,w_64)macOS

    2篇

  - ![img](https://img-blog.csdnimg.cn/9f9622410bc54d3297ff542418cbca74.jpeg?x-oss-process=image/resize,m_fixed,h_64,w_64)Python应用

    14篇

  - ![img](https://img-blog.csdnimg.cn/aefd6ab91304421281a57d3d9e10803e.jpeg?x-oss-process=image/resize,m_fixed,h_64,w_64)爬虫基础

    9篇

  - ![img](https://img-blog.csdnimg.cn/0e0f586f87214b059e1a59e297059b06.jpeg?x-oss-process=image/resize,m_fixed,h_64,w_64)CMake

    9篇

  - ![img](https://img-blog.csdnimg.cn/34db8b131b4f48448a769eb0d15f0e67.jpeg?x-oss-process=image/resize,m_fixed,h_64,w_64)gtest

    3篇

  - ![img](https://img-blog.csdnimg.cn/513c0ad7565542f5ae9f39d0823acd93.jpeg?x-oss-process=image/resize,m_fixed,h_64,w_64)疑难杂症

    11篇

  - ![img](https://img-blog.csdnimg.cn/83aec18f339644dfafe6c65e6d888bd7.jpeg?x-oss-process=image/resize,m_fixed,h_64,w_64)markdown

    11篇

  - ![img](https://img-blog.csdnimg.cn/54a0b89bbbe041f2b6ef144150bbbf40.jpeg?x-oss-process=image/resize,m_fixed,h_64,w_64)Linux

    8篇

  - ![img](https://img-blog.csdnimg.cn/e9453085325c464fb8b91bbf7979328c.jpeg?x-oss-process=image/resize,m_fixed,h_64,w_64)数据库

    6篇

  - ![img](https://img-blog.csdnimg.cn/c665e5bffaf945158dc1d0ed10d4011c.jpeg?x-oss-process=image/resize,m_fixed,h_64,w_64)数据分析

    4篇

  - ![img](https://img-blog.csdnimg.cn/1c8baf4f1196481abe8a17c9509db473.jpeg?x-oss-process=image/resize,m_fixed,h_64,w_64)Python并发编程

    12篇

  - ![img](https://img-blog.csdnimg.cn/4e762171a33b4f2eb63f682572cd6c48.jpeg?x-oss-process=image/resize,m_fixed,h_64,w_64)Python基础

    20篇

  - ![img](https://img-blog.csdnimg.cn/e2daf3201a764a57b527648e8bc72ce7.jpeg?x-oss-process=image/resize,m_fixed,h_64,w_64)Python图形界面-PyQt5入门系列教程

    29篇

  - ![img](https://img-blog.csdnimg.cn/6182e4b5e2664f888f9817b931402ea7.jpeg?x-oss-process=image/resize,m_fixed,h_64,w_64)Python环境配置

    2篇

  - ![img](https://img-blog.csdnimg.cn/b6a29f653bad4c029582b6a10db1b4d4.jpeg?x-oss-process=image/resize,m_fixed,h_64,w_64)Twisted框架

    1篇

  - ![img](https://img-blog.csdnimg.cn/423278f38a154e6ab49d00b4ca2ea5ae.jpeg?x-oss-process=image/resize,m_fixed,h_64,w_64)一起学习5GNR吧

  - ![img](https://img-blog.csdnimg.cn/5a852f9aede448ed84e9d788372badde.jpeg?x-oss-process=image/resize,m_fixed,h_64,w_64)C++

    16篇

  - ![img](https://img-blog.csdnimg.cn/6e9a4a54a3854daaaeba47473cf6d721.jpeg?x-oss-process=image/resize,m_fixed,h_64,w_64)前端

    1篇

  ![img](https://csdnimg.cn/release/blogv2/dist/pc/img/arrowDownWhite.png)

  ### 最新评论

  - Python使用Selenium WebDriver的入门介绍及安装教程

    [weixin_52315102: ](https://blog.csdn.net/weixin_52315102)selenium webdriver教程： https://misishijie.com/crankymonkey/selenium_webdriver/index.htm

  - PyQt中的多线程QThread示例

    [qq_27923191: ](https://blog.csdn.net/qq_27923191)要是用 uic动态load的ui界面，能直接导入吗

  - Python使用Selenium WebDriver的入门介绍及安装教程

    [smart_cat: ](https://blog.csdn.net/hubing_hust)闪退的原因基本是程序异常导致的，比如查找某个页面元素找不到，这些都是会引发异常的，一旦有了异常，浏览器就会退出，运行程序的时候注意看下控制台的输出，应该是可以看到相关信息的

  - Python使用Selenium WebDriver的入门介绍及安装教程

    [smart_cat: ](https://blog.csdn.net/hubing_hust)闪退的原因基本是程序异常导致的，比如查找某个页面元素找不到，这些都是会引发异常的，一旦有了异常，浏览器就会退出，运行程序的时候注意看下控制台的输出，应该是可以看到相关信息的

  - Pandas告警UserWarning: pandas only supports SQLAlchemy connectable

    [灬糖糖灬: ](https://blog.csdn.net/weixin_50662112)求問，怎麼加多個MYSQL_DB呀？~![表情包](https://g.csdnimg.cn/static/face/emoji/051.png)

  ### 您愿意向朋友推荐“博客详情页”吗？

  - ![img](https://csdnimg.cn/release/blogv2/dist/pc/img/npsFeel1.png)

    强烈不推荐

  - ![img](https://csdnimg.cn/release/blogv2/dist/pc/img/npsFeel2.png)

    不推荐

  - ![img](https://csdnimg.cn/release/blogv2/dist/pc/img/npsFeel3.png)

    一般般

  - ![img](https://csdnimg.cn/release/blogv2/dist/pc/img/npsFeel4.png)

    推荐

  - ![img](https://csdnimg.cn/release/blogv2/dist/pc/img/npsFeel5.png)

    强烈推荐

  ### 最新文章

  - [Microsoft 365 E5 开发者如何添加新用户](https://blog.csdn.net/hubing_hust/article/details/128744467)
  - [C++11静态断言static_assert](https://blog.csdn.net/hubing_hust/article/details/128672181)
  - [C++17引入的结构化绑定](https://blog.csdn.net/hubing_hust/article/details/128667994)

  [2023年19篇](https://blog.csdn.net/hubing_hust?type=blog&year=2023&month=01)

  [2022年99篇](https://blog.csdn.net/hubing_hust?type=blog&year=2022&month=12)

  [2020年1篇](https://blog.csdn.net/hubing_hust?type=blog&year=2020&month=09)

  [2019年1篇](https://blog.csdn.net/hubing_hust?type=blog&year=2019&month=06)

  [2015年3篇](https://blog.csdn.net/hubing_hust?type=blog&year=2015&month=04)

  ![img](https://kunyu.csdn.net/1.png?p=57&adId=1033838&adBlockFlag=0&a=1033838&c=0&k=%E5%A6%82%E4%BD%95%E5%9C%A8windows%E4%B8%8A%E4%BD%BF%E7%94%A8VMware%E5%AE%89%E8%A3%85macOS%E8%99%9A%E6%8B%9F%E6%9C%BA&spm=1001.2101.3001.5001&articleId=128596690&d=1&t=3&u=e1d3f51dd6794975bced8b186125251a)

  ### 目录

  1. [如何在windows上使用VMware安装macOS虚拟机](https://blog.csdn.net/hubing_hust/article/details/128596690#t0)
  2. [一、准备工作](https://blog.csdn.net/hubing_hust/article/details/128596690#t1)
  3. 1. [1.1 安装 VMware](https://blog.csdn.net/hubing_hust/article/details/128596690#t2)
     2. [1.2 下载macOS的安装包](https://blog.csdn.net/hubing_hust/article/details/128596690#t3)
     3. [1.3 下载VMware虚拟机解锁安装苹果系统工具](https://blog.csdn.net/hubing_hust/article/details/128596690#t4)
  4. [二、解锁VMware支持macOS安装](https://blog.csdn.net/hubing_hust/article/details/128596690#t5)
  5. 1. [2.1 关闭已经打开的VMware软件](https://blog.csdn.net/hubing_hust/article/details/128596690#t6)
     2. [2.2 安装VMware Workstation Unlocker](https://blog.csdn.net/hubing_hust/article/details/128596690#t7)
  6. [三、VMware创建虚拟机](https://blog.csdn.net/hubing_hust/article/details/128596690#t8)
  7. 1. [3.1 解压缩macOS的安装包](https://blog.csdn.net/hubing_hust/article/details/128596690#t9)
     2. [3.2 新建macOS的虚拟机](https://blog.csdn.net/hubing_hust/article/details/128596690#t10)
  8. [四、安装macOS虚拟机](https://blog.csdn.net/hubing_hust/article/details/128596690#t11)
  9. 1. [4.1 选择CD/DVD](https://blog.csdn.net/hubing_hust/article/details/128596690#t12)
     2. [4.2 开始安装](https://blog.csdn.net/hubing_hust/article/details/128596690#t13)
     3. [4.3 配置系统](https://blog.csdn.net/hubing_hust/article/details/128596690#t14)

  

  ![img](https://csdnimg.cn/release/blogv2/dist/pc/img/iconShowDirectory.png)![img](https://csdnimg.cn/release/blogv2/dist/pc/img/iconSideBeta.png)![img](https://csdnimg.cn/release/blogv2/dist/pc/img/iconHideSide.png)![img](https://csdnimg.cn/release/blogv2/dist/pc/img/iconSideBeta.png)![img](https://g.csdnimg.cn/side-toolbar/3.4/images/guide.png)![img](https://g.csdnimg.cn/side-toolbar/3.4/images/kefu.png)举报![img](https://g.csdnimg.cn/side-toolbar/3.4/images/fanhuidingbucopy.png)

  [![img](https://csdnimg.cn/release/blogv2/dist/pc/img/newarticleComment1White.png)评论](javascript:;)[![img](https://csdnimg.cn/release/blogv2/dist/pc/img/newcNoteWhite.png)笔记](javascript:;)