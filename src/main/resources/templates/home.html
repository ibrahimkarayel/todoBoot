<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Home</title>
    <meta name="description" content="spring-boot thymeleaf | home ">
    <div th:replace="fragments/header :: header-css"></div>
</head>
<body>

<div th:replace="fragments/header :: header"></div>

<div class="tab-content">

    <div class="tab-pane active" id="addTaskTab">
        <div class="container">
            <div class="content-container clearfix">
                <div class="row">
                    <h1 class="content-title">Tasks</h1>
                    <!--star operations messages-->
                    <div th:if="${msg eq 'success'}" class="alert alert-success alert-dismissable">
                        <button type="button" class="close" data-dismiss="alert"
                                aria-hidden="true">&times;
                        </button>
                        Task Saved <strong> Successfully</strong>
                    </div>
                    <div th:if="${msg eq 'fail'}" class="alert alert-danger alert-dismissable">
                        <button type="button" class="close" data-dismiss="alert"
                                aria-hidden="true">&times;
                        </button>
                        <strong>Unexpected error occurred !!! Please try later.</strong>
                    </div>
                    <div th:if="${msg eq 'active'}" class="alert alert-success alert-dismissable">
                        <button type="button" class="close" data-dismiss="alert"
                                aria-hidden="true">&times;
                        </button>
                        <strong><h6 th:text="${msgText}"/></strong>
                    </div>
                    <div th:if="${msg eq 'active_fail'}" class="alert alert-danger alert-dismissable">
                        <button type="button" class="close" data-dismiss="alert"
                                aria-hidden="true">&times;
                        </button>
                        <strong>Error !!!</strong> <h6 th:text="${msgText}"/>
                    </div>
                    <div th:if="${msg eq 'trash'}" class="alert alert-success alert-dismissable">
                        <button type="button" class="close" data-dismiss="alert"
                                aria-hidden="true">&times;
                        </button>
                        Task Sent to Trash Box
                    </div>
                    <!--end of messages-->
                    <form th:object="${reqTask}" th:action="@{/task/saveTask}" method="post">
                        <div class="col-md-12">
                            <div class="form-group">
                                <input id="taskName" th:field="*{taskName}" type="text" class="form-control"
                                       required="required"
                                       placeholder="Task Name"/>
                            </div>
                            <div class="form-group">
                                <input th:field="*{description}" type="text" class="form-control" required="required"
                                       placeholder="Description"/>
                            </div>
                            <div class="form-group">
                                <div class="col-md-4  input-group date" id='startDatePicker'>
                                    <input th:field="*{taskDate}" class="form-control" name="taskDate"
                                           required="required"
                                           placeholder="Task Date" id="taskDate"/>
                                    <span class="input-group-addon">
                                    <span class="glyphicon glyphicon-calendar">
                                    </span>
                                </span>
                                </div>
                            </div>
                            <textarea class="form-control" th:field="*{content}" placeholder="Details"
                                      required="required"></textarea>
                            <div class="float-right btn-send">
                                <button class="btn btn-success btn-md"><span class="glyphicon glyphicon-send"></span>
                                    Create
                                </button>
                            </div>
                        </div>
                        <br/>
                    </form>
                </div>
                <span class="help-block"></span>
                <!--start Trash Task tab-->
                <div class="row">
                    <div class="panel panel-info">
                        <div class="panel-body">
                            <table class="table table-bordered  table-striped table-responsive">
                                <thead>
                                <tr class="btn-info">
                                    <th>Task Name</th>
                                    <th>Description</th>
                                    <th>Task Date</th>
                                    <th>Details</th>
                                    <th>Operation</th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr th:if="${#lists.isEmpty(allTask)}" class="btn-default">
                                    <td colspan="5" align="center">No Task Entered Yet!!!</td>
                                </tr>
                                <tr th:each="task : ${allTask}">
                                    <td th:text="${task.taskName}"></td>
                                    <td th:text="${task.description}"></td>
                                    <td th:text="${task.taskDate}"></td>
                                    <td th:text="${task.content}"></td>
                                    <td th:hidden="${task.id}"></td>
                                    <td align="center">
                                        <a th:href="@{/task/edit/{id}(id=${task.id})}">
                                            <span class="glyphicon glyphicon-edit" data-toggle="tooltip"
                                                  data-placement="top" title="Edit Task"></span></a>
                                        &nbsp; &nbsp;
                                        <a data-toggle="modal" data-target="#modal-toTrash"
                                           th:attr="data-target='#modal-toTrash'+${task.id}">
                                            <span class="glyphicon glyphicon-trash" data-toggle="tooltip"
                                                  data-placement="top" title="Sent to Trash Box"></span></a>
                                    </td>
                                    <!--start send to trash modal-->
                                    <div class="modal modal-toTrash" th:id="modal-toTrash+${task.id}">
                                        <div class="modal-dialog">
                                            <div class="modal-content">
                                                <div class="modal-header">
                                                    <button type="button" class="close" data-dismiss="modal"
                                                            aria-hidden="true">×
                                                    </button>
                                                    <h3 id="myModalLabel">Delete Confirmation</h3>
                                                </div>
                                                <div class="modal-body">
                                                    <p class="error-text"><strong>Are you sure you want to
                                                        delete this task ?</strong></p>
                                                </div>
                                                <div class="modal-footer">
                                                    <button class="btn " data-dismiss="modal" aria-hidden="true">
                                                        Cancel
                                                    </button>
                                                    <a th:href="@{/task/trash/{id}(id=${task.id})}">
                                                        <span class="btn btn-danger" value="delete">Delete</span></a>

                                                </div>
                                            </div>
                                            <!-- /.modal-content -->
                                        </div>
                                        <!-- /.modal-dialog -->
                                    </div>
                                    <!--end send to trash modal-->
                                </tr>

                                </tbody>
                            </table>
                        </div>

                    </div>

                </div>
                <!--end Trash task tab-->
            </div>
        </div>
    </div>
    <!-- trash tab -->
    <!--th:class="${#request.getParameter('deletion')=='del'} ? ' tab-pane active' : 'tab-pane' "-->
    <div class="tab-pane" id="trashTab">
        <div class="container">
            <div class="content-container clearfix">
                <div class="col-md-12">
                    <h1 class="content-title">Trash</h1>
                    <input type="search" placeholder="Search Task" class="form-control mail-search"/>

                    <div class="panel panel-info">

                        <div class="panel-body">
                            <table class="table table-bordered table-striped table-responsive">
                                <thead>
                                <tr class="btn-info">
                                    <th>Task Name</th>
                                    <th>Description</th>
                                    <th>Task Date</th>
                                    Search Task
                                    <th>Details</th>
                                    <th>Operation</th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr th:if="${#lists.isEmpty(allPassiveTask)}" class="btn-default">
                                    <td colspan="5" align="center">No Task Entered Yet!!!</td>
                                </tr>
                                <tr th:each="task : ${allPassiveTask}">
                                    <td th:text="${task.taskName}"></td>
                                    <td th:text="${task.description}"></td>
                                    <td th:text="${task.taskDate}"></td>
                                    <td th:text="${task.content}"></td>
                                    <td th:hidden="${task.id}"></td>
                                    <td align="center">
                                        <a th:href="@{/task/restore/{id}(id=${task.id})}">
                                            <span class="fas fa-sync" data-toggle="tooltip" data-placement="top"
                                                  title="Restore Task"></span></a>
                                        &nbsp; &nbsp;
                                        <a data-toggle="modal" data-target="#modal-delete"
                                           th:attr="data-target='#modal-delete'+${task.id}">
                                            <span class="glyphicon glyphicon-trash" data-toggle="tooltip"
                                                  data-placement="top" title="Delete Permanently"></span></a>

                                    </td>
                                    <!--start permanently delete modal-->
                                    <div class="modal modal-delete" th:id="modal-delete+${task.id }">
                                        <div class="modal-dialog">
                                            <div class="modal-content">
                                                <div class="modal-header">
                                                    <button type="button" class="close" data-dismiss="modal"
                                                            aria-hidden="true">×
                                                    </button>
                                                    <h3 id="delModalLabel">Delete Confirmation</h3>
                                                </div>
                                                <div class="modal-body">
                                                    <p class="error-text"><strong>Are you sure you want to
                                                        delete this task ?</strong></p>
                                                </div>
                                                <div class="modal-footer">
                                                    <button class="btn " data-dismiss="modal" aria-hidden="true">
                                                        Cancel
                                                    </button>
                                                    <a th:href="@{/task/delete/{id}(id=${task.id})}">
                                                        <span class="btn btn-danger" value="delete">Delete</span></a>

                                                </div>
                                            </div>
                                            <!-- /.modal-content -->
                                        </div>
                                        <!-- /.modal-dialog -->
                                    </div>
                                    <!--end delete modal-->
                                </tr>

                                </tbody>
                            </table>
                        </div>

                    </div>
                </div>
            </div>
        </div>

    </div>
</div>
<footer>
    <div class="separator" th:replace="fragments/footer :: footer">&copy; 2016 pironix</div>
</footer>

<script type="text/javascript">
    $(function () {
        $('#startDatePicker').datetimepicker({
            defaultDate: 'now',
            viewMode: 'days',
            format: 'DD/MM/YYYY'
        });
    });


</script>
<script>
    $('#modal-toTrash').on('show.bs.modal', function (e) {
        $(this).find('.btn-ok').attr('href', $(e.relatedTarget).data('href'));
        $('#modal-toTrashHiddenId').val($(this).find('.btn-ok').attr('href'));
    });

    $('#modal-delete').on('show.bs.modal', function (e) {
        $(this).find('.btn-ok').attr('href', $(e.relatedTarget).data('href'));
        $('#modal-deleteHiddenId').val($(this).find('.btn-ok').attr('href'));
    });

</script>
</body>
</html>
