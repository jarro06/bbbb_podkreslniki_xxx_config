 
listView('bbbb_podkreslniki_xxx Jobs') {
    description('bbbb_podkreslniki_xxx Jobs')
    jobs {
        regex('bbbb_podkreslniki_xxx_.+')
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
