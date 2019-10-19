[toc]

# 第1次作业-leve5-陈秋余-2019213975 #

### 项目介绍

+ **Andriodd第1次作业-完结**

  献上__重构__之后的__Lv4__.

### 项目特点

+ **没啥特点**~~就是随便写写~~

  用了几次重载~~真没啥特别的~~

### 项目GoGoGoL类中的方法介绍

##### （一） createNew

**boolean createNew()**

```java
boolean createNew(){
    strArrays = new String[0];
    return true;
}
```

创建一个属于**GoGoGo**类且长度位0的字符串数组

返回**boolean**值，**true**表示成功

---

---

---

##### （二） create

**boolean create(String[] inPut)**

```java
boolean create(String[] inPut){    
    strArrays = inPut;    
    return true;
}
```

依据输入的字符串数组，生成一个属于**GoGoGo**类的字符串数组

返回**boolean**值，**true**表示成功

---

---

---

##### （三） add[^**==1==**]

###### 1.add(String systemIn ,int index)

```java
boolean add(String systemIn ,int index) {
    String[] cache = new String[strArrays.length+1];
    for (int indexCopy = strArrays.length;indexCopy > index;indexCopy--) {
        cache[indexCopy] = strArrays[indexCopy-1];
    }
    cache[index] = systemIn;
    for (int indexCopy = 0;indexCopy<index;indexCopy++){
        cache[indexCopy] = strArrays[indexCopy];
    } 
    strArrays = cache;  
    return true;}
```

将***systemIn***插入至**下标为*Index*处**

返回**boolean**值，**true**表示成功

---

###### 2.add(String systemIn)

```java
boolean add(String systemIn) {
   	String[] cache = new String[strArrays.length+1];
    for (int index =0;index < cache.length-1;index++) {
        cache[index] = strArrays[index];
    }
    cache[cache.length-1] = systemIn;
    strArrays = cache;
    return true;
}
```

将***systemIn***插入至末尾

返回**boolean**值，**true**表示成功

---

###### 3.add(String[] frontArrays,String[] behindArrays)

```java
String[] add(String[] frontArrays,String[] behindArrays) {
    String[] cache = new String[frontArrays.length+behindArrays.length];
    for (int i = 0;i < cache.length;i++) {
        if (i < frontArrays.length)
			cache[i] = frontArrays[i];
		if (i > frontArrays.length - 1)
           	cache[i] = behindArrays[i - frontArrays.length];
    }
    return cache;
}
```

将***frontArrays***和***behindArrays***合并，***frontArrays***在前***behindArrays***在后

返回**boolean**值，**true**表示成功

---

###### 4.add(String[] behindArrays)

```java
boolean add(String[] behindArrays) {
    String[] cache = new String[strArrays.length+behindArrays.length];
	for (int i = 0;i < cache.length;i++) {
		if (i < strArrays.length)
			cache[i] = strArrays[i];
		if (i > strArrays.length - 1)
		cache[i] = behindArrays[i - strArrays.length];
        }
    strArrays = cache;
    return true;
}
```

将***behindArrays***插入至字符串数组末尾

返回**boolean**值，**true**表示成功

---

---

---

##### （四）delete[^**==1==**]

###### 1.delete(int index)

```java
boolean delete(int index) {
	String[] cache = new String[strArrays.length-1];
	for (int subscriptCopy = index;subscriptCopy < cache.length;subscriptCopy++) {
		cache[subscriptCopy] = strArrays[subscriptCopy+1];
	}
	for (int subscriptCopy = 0;subscriptCopy < index;subscriptCopy++) {
		cache[subscriptCopy] = strArrays[subscriptCopy];
	}
	strArrays = cache;
	return true;
}
```

删除***index***处的元素

返回**boolean**值，**true**表示成功

---

###### 2.delete()

```java
boolean delete() {
	String[] cache = new String[strArrays.length-1];
    for (int i = 0;i < cache.length;i++)
        cache[i] = strArrays[i];
    strArrays = cache;
    return true;
}
```

删除字符串数组最后一个元素

返回**boolean**值，**true**表示成功

---

---

---

##### （五）clear

**clear()**

```java
boolean clear() {
	strArrays = new String[0];
    return true;
}
```

清除现有数组的所有元素

返回**boolean**值，**true**表示成功

---

---

---

##### （六）changeString

**changeString(String newStr,int index)**

```java
boolean changeString(String newStr,int index) {    strArrays[index] = newStr;    return true;}
```

将**下标为*index*处**的元素替换为***newStr***

返回**boolean**值，**true**表示成功

---

---

---

##### （七）contains

**contains(String object)**

```java
boolean contains(String object) {
    for (String a:strArrays) {
        if (a.equals(object)) {
        	return true;
    	}
    }
    return false;    
}
```

判断数组内是否存在***object***

返回**boolean**值，存在**true**，不存在**false**

---

---

---

##### （八）get

###### 1.get(int index)

```java
String get(int index) {
	return strArrays[index];
}
```

获取**下标为*index*的元素**

返回**String**值，即此元素

---

###### 2.getLength()

```java
Integer getLength() {
    return strArrays.length;
}
```

返回**int**值，即数组长度

---

---

---



### 关于作者

Seven749

QQ:1142013327

---

[^**==1==**]:==此方法重载多次，会根据输入的变量类型及数量执行不同算法==

