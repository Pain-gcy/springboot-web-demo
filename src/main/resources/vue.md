
#### vue.js使用说明

> 事件绑定
    
    数据绑定最常见的形式就是使用 {{...}}（双大括号）的文本插值
        
    v-html 指令用于输出 html 代码
        
    v-on:click、@click 点击事件监听
          
    v-bind:href 、:href  连接
        
    v-model(双向数据绑定)  指令用来在 input、select、text、checkbox、radio 等表单控件元素上创建双向数据绑定，根据表单上的值，自动更新绑定的元素的值。
    
    按钮的事件我们可以使用 v-on 监听事件，并对用户的输入进行响应。
        
    条件语句.
        v-show v-if v-else-if  v-else 注意：v-else 、v-else-if 必须跟在 v-if 或者 v-else-if之后
        
    循环语句：v-for 迭代
        
    监听：watch 
     
> 样式 绑定：
    
     v-bind:class  设置一个对象，从而动态的切换 class:
        
     v-bind:style   style(内联样式) 直接设置样式 
        
     
> 事件修饰

    <!-- 阻止单击事件冒泡 -->
    <a v-on:click.stop="doThis"></a>
    <!-- 提交事件不再重载页面 -->
    <form v-on:submit.prevent="onSubmit"></form>
    <!-- 修饰符可以串联  -->
    <a v-on:click.stop.prevent="doThat"></a>
    <!-- 只有修饰符 -->
    <form v-on:submit.prevent></form>
    <!-- 添加事件侦听器时使用事件捕获模式 -->
    <div v-on:click.capture="doThis">...</div>
    <!-- 只当事件在该元素本身（而不是子元素）触发时触发回调 -->
    <div v-on:click.self="doThat">...</div>
    
    <!-- click 事件只能点击一次，2.1.4版本新增 -->
    <a v-on:click.once="doThis"></a>
    
> 组件 
    
    Vue.component(tagName, options) 全局的组件 
        
    components: {} 局部的组件
        
    prop 是父组件用来传递数据的一个自定义属性。
    父组件的数据需要通过 props 把数据传给子组件，子组件需要显式地用 props 选项声明 "prop"
    v-bind 动态绑定 props 的值到父组件的数据中。每当父组件的数据变化时，该变化也会传导给子组件
        
    自定义事件：父类接受子类传递的数据
        
>  路由
    
    
> Vue.ajax
    
    // 基于全局Vue对象使用http
    Vue.http.get('/someUrl', [options]).then(successCallback, errorCallback);
    Vue.http.post('/someUrl', [body], [options]).then(successCallback, errorCallback);
    
    // 在一个Vue实例内使用$http
    this.$http.get('/someUrl', [options]).then(successCallback, errorCallback);
    this.$http.post('/someUrl', [body], [options]).then(successCallback, errorCallback);
    
    
    
    

    
    
    
          