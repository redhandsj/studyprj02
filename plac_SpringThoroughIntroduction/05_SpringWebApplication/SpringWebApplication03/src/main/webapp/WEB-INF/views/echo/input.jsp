<html>
<body>
    <h2>入力画面</h2>
    <%-- JSpring MVCから提供されている<form:from>要素を使用して、HTMLのフォームを作成する  --%>
    <form:form modelAttribute="echoForm">
        <div>テキストを入力してください ：</div>
        <div>
            日付
            <form:input path="dtext" />
            <%-- 属性に指定したプロパ ティのエラー情報が表示される --%>
            <form:errors path="dtext" />
        </div>
        <div>
            科目
            <form:input path="text" />
            <%-- 属性に指定したプロパ ティのエラー情報が表示される --%>
            <form:errors path="text" />
        </div>
        <div>
            金額
            <form:input path="amount" />
            <%-- 属性に指定したプロパ ティのエラー情報が表示される --%>
            <form:errors path="amount" />
        </div>
        <div>
            <form:button>送信</form:button>
        </div>
    </form:form>
</body>
</html>