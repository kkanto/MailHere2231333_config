 
listView('MailHere2231333 Jobs') {
    description('MailHere2231333 Jobs')
    jobs {
        regex('MailHere2231333_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
