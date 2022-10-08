package com.StackBracket;

import java.util.Stack;

public class BracketCheck {
    public boolean checkBracket(String s){//参数为一个字符串s
        Stack<Character> stack=new Stack<>();//新建一个栈
        for(int i=0;i<s.length();i++){//遍历s数组中的每个字符，用i记录位置
            char bracket=s.charAt(i);//将i所在字符赋值给bracket
            if(bracket=='('|| bracket=='['||bracket=='{'){//判断bracket是否为左括号
                stack.push(bracket);//将字符bracket进栈
            }else {
                if(stack.isEmpty()){//bracket是右括号，但是栈内为空（没有左括号），返回"错误"
                    return false;
                } else {
                    char top=stack.peek();//bracket是右括号，而且和栈顶左括号匹配
                    if(top=='('&& bracket==')'||top=='['&& bracket==']'||top=='{'&& bracket=='}'){
                        stack.pop();//取出栈顶元素
                    } else {
                        return false;//bracket是右括号，但是和栈顶左括号不匹配，返回"错误"
                    }
                }
            }
        }
        if(!stack.isEmpty()){//当字符串s被遍历结束，如果栈内还有剩余，说明左括号多了，返回错误
            return false;
        }
        return true;//括号匹配成功！
    }
}
