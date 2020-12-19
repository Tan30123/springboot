
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>我的首页</title>
</head>
<body>
        <#list emps as emp>
        <table>
                <tr>
                    <th>${emp.empid}</th>
                    <th>${emp.empname}</th>
                    <th>${emp.salary}</th>
                    <th>${emp.hiredate}</th>
                </tr>
        </table>
        </#list>
</body>
</html>
