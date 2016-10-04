html{
  head {
    title('Groovy Page')
    style('''
      h1{ font-size:18pt; font-weight:bold; color:gray; }
      body{ font-size:13pt; color:gray; margin:5px 25px; }
    ''')
  }
  body{
    h1('Index Page')
    p(msg)
    form(method:'post',action:'/'){
      input(type:'text',name:'num')
      input(type:'submit')
    }
  }
}