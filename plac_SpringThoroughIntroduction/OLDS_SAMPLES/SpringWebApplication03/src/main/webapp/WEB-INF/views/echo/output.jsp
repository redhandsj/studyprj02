<html>
<body>
    <h2>出力画面</h2>
    <div>入力したテキストは・・・</div>
    <div>
    <%--JSTLの<c:out>要素を使用すると、XSS攻撃で使用される特殊な記号（<、>、&、'、"） を単なる文字としてHTMLに出力 --%>
     日付「<span><c:out value="${echoForm.dtext}" /></span>」<br>
     科目「<span><c:out value="${echoForm.text}" /></span>」<br>
     金額「<span><c:out value="${echoForm.amount}" /></span>」
    </div>
    <div>です。</div>
    <br>
    <div>
        <a href="<c:url value='/' />">トップ画面へ戻る</a>
    </div>
</body>
</html>