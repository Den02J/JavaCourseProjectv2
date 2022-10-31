<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <!-- CSS only -->
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
</nav>

<div>
    <table class="table table-dark table-striped" style="text-align: center">
        <tr style="font-size: 18px;">
            <th>First name</th>
            <th>Last name</th>
            <th>Specialty</th>
            <th>Points</th>
        </tr>
        <#list students as student>
            <tr>
                <td>${student.firstName}</td>
                <td>${student.lastName}</td>
                <td>${student.specialty}</td>
                <td>
                    <a class="btn btn-info" href="/students/view-points/${student.id}">Check points</a>
                </td>
            </tr>
        </#list>
    </table>

</div>
</body>
</html>