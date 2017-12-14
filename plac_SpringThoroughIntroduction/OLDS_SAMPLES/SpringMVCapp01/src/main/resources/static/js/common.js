function submitAction(obj, act, method)
{
	obj.form.method = method;
	obj.form.action='./' + act;
	obj.form.submit();
}
