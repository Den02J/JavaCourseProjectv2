<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
</head>
<body style="background: #212529">

<nav class="navbar sticky-top navbar-expand-lg navbar-dark bg-dark" style="font-size: 20px;">
    <a class="navbar-brand ml-2" href="#">Navbar</a>

    <div class="collapse navbar-collapse" id="navbarNavDropdown">
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" href="/students/view">View page</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/students/">Student page</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/students/examinerView">Examiner page</a>
            </li>
        </ul>
    </div>
    <a class="navbar-brand mr-2" href="/students">Add student</a>
</nav>

    <div>
        <table class="table table-hover table-dark" style="text-align: center">
            <thead>
                <tr style="font-size: 18px;">
                        <th>First name</th>
                        <th>Last name</th>
                        <th>Specialty</th>
                        <th>Delete</th>
                        <th>Update</th>
                </tr>
            </thead>

            <#list students as student>
                <tr>
                    <td>${student.firstName}</td>
                    <td>${student.lastName}</td>
                    <td>${student.specialty}</td>
                    <td>
                        <a class="btn btn-danger" href="/students/delete/${student.id}">Delete</a>
                    </td>
                    <td>
                        <a class="btn btn-warning" href="/students/update/${student.id}">Update</a>
                    </td>
                </tr>
            </#list>
        </table>

<#--        <a href="/students">Create student</a>-->
<#--        <a href="/students/view">View page</a>-->
<#--        <a href="/students/examinerView">Examiner page</a>-->

    </div>
</body>
</html>