export function isAuth(tableName, key) {
  let role = localStorage.getItem("UserTableName");
  let menus = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["新增","查看","修改","删除"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["新增","查看","修改","删除"],"menu":"导师","menuJump":"列表","tableName":"daoshi"}],"menu":"导师管理"},{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["查看","修改","删除","审核","查看评论"],"menu":"课题信息","menuJump":"列表","tableName":"ketixinxi"}],"menu":"课题信息管理"},{"child":[{"appFrontIcon":"cuIcon-discover","buttons":["查看","修改","删除"],"menu":"学生选题","menuJump":"列表","tableName":"xueshengxuanti"}],"menu":"学生选题管理"},{"child":[{"appFrontIcon":"cuIcon-flashlightopen","buttons":["查看","修改","删除"],"menu":"论文提交","menuJump":"列表","tableName":"lunwentijiao"}],"menu":"论文提交管理"},{"child":[{"appFrontIcon":"cuIcon-present","buttons":["查看","修改","删除"],"menu":"论文指导","menuJump":"列表","tableName":"lunwenzhidao"}],"menu":"论文指导管理"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["查看","修改","删除"],"menu":"论文答辩","menuJump":"列表","tableName":"lunwendabian"}],"menu":"论文答辩管理"},{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["查看","修改","删除","答辩结果统计"],"menu":"答辩成绩","menuJump":"列表","tableName":"dabianchengji"}],"menu":"答辩成绩管理"},{"child":[{"appFrontIcon":"cuIcon-vipcard","buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"公告信息","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["查看","立即选课"],"menu":"课题信息列表","menuJump":"列表","tableName":"ketixinxi"}],"menu":"课题信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-discover","buttons":["查看","提交论文"],"menu":"学生选题","menuJump":"列表","tableName":"xueshengxuanti"}],"menu":"学生选题管理"},{"child":[{"appFrontIcon":"cuIcon-flashlightopen","buttons":["查看","删除"],"menu":"论文提交","menuJump":"列表","tableName":"lunwentijiao"}],"menu":"论文提交管理"},{"child":[{"appFrontIcon":"cuIcon-present","buttons":["查看","删除","答辩"],"menu":"论文指导","menuJump":"列表","tableName":"lunwenzhidao"}],"menu":"论文指导管理"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["查看","删除"],"menu":"论文答辩","menuJump":"列表","tableName":"lunwendabian"}],"menu":"论文答辩管理"},{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["查看","删除"],"menu":"答辩成绩","menuJump":"列表","tableName":"dabianchengji"}],"menu":"答辩成绩管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["查看","立即选课"],"menu":"课题信息列表","menuJump":"列表","tableName":"ketixinxi"}],"menu":"课题信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"学生","tableName":"xuesheng"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["新增","查看","修改","删除"],"menu":"课题信息","menuJump":"列表","tableName":"ketixinxi"}],"menu":"课题信息管理"},{"child":[{"appFrontIcon":"cuIcon-discover","buttons":["查看","审核"],"menu":"学生选题","menuJump":"列表","tableName":"xueshengxuanti"}],"menu":"学生选题管理"},{"child":[{"appFrontIcon":"cuIcon-flashlightopen","buttons":["查看","删除","审核","论文指导"],"menu":"论文提交","menuJump":"列表","tableName":"lunwentijiao"}],"menu":"论文提交管理"},{"child":[{"appFrontIcon":"cuIcon-present","buttons":["查看","删除"],"menu":"论文指导","menuJump":"列表","tableName":"lunwenzhidao"}],"menu":"论文指导管理"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["查看","删除","答辩成绩"],"menu":"论文答辩","menuJump":"列表","tableName":"lunwendabian"}],"menu":"论文答辩管理"},{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["查看","删除","答辩结果","答辩结果统计"],"menu":"答辩成绩","menuJump":"列表","tableName":"dabianchengji"}],"menu":"答辩成绩管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["查看"],"menu":"公告信息","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["查看","立即选课"],"menu":"课题信息列表","menuJump":"列表","tableName":"ketixinxi"}],"menu":"课题信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"导师","tableName":"daoshi"}];
  for(let i=0;i<menus.length;i++){
    if(menus[i].tableName==role){
      for(let j=0;j<menus[i].frontMenu.length;j++){
          for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
            if(tableName==menus[i].frontMenu[j].child[k].tableName){
              let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
              return buttons.indexOf(key) !== -1 || false
            }
          }
      }
    }
  }
  return false;
}

/**
 *  * 获取当前时间（yyyy-MM-dd hh:mm:ss）
 *   */
export function getCurDateTime() {
    let currentTime = new Date(),
    year = currentTime.getFullYear(),
    month = currentTime.getMonth() + 1 < 10 ? '0' + (currentTime.getMonth() + 1) : currentTime.getMonth() + 1,
    day = currentTime.getDate() < 10 ? '0' + currentTime.getDate() : currentTime.getDate(),
    hour = currentTime.getHours(),
    minute = currentTime.getMinutes(),
    second = currentTime.getSeconds();
    return year + "-" + month + "-" + day + " " +hour +":" +minute+":"+second;
}

/**
 *  * 获取当前日期（yyyy-MM-dd）
 *   */
export function getCurDate() {
    let currentTime = new Date(),
    year = currentTime.getFullYear(),
    month = currentTime.getMonth() + 1 < 10 ? '0' + (currentTime.getMonth() + 1) : currentTime.getMonth() + 1,
    day = currentTime.getDate() < 10 ? '0' + currentTime.getDate() : currentTime.getDate();
    return year + "-" + month + "-" + day;
}
