/**
 * @param {string[]} cpdomains
 * @return {string[]}
 */
var subdomainVisits = function(cpdomains) {
    let visitedMap = {},
        res = []
    cpdomains.forEach(cpdomain => {
        let baseCount = parseInt(cpdomain.split(' ')[0]),
            domain = cpdomain.split(' ')[1],
            domainSplits = domain.split('.'),
            start = domainSplits.length - 1
        
        while (start >= 0) {
            let subDomain = domainSplits.slice(start).join('.')
            if (visitedMap[subDomain] === undefined) {
                visitedMap[subDomain] = baseCount
            } else {
                visitedMap[subDomain] += baseCount
            }
            start--
        }
    })
    for (let key in visitedMap) {
        res.push(`${visitedMap[key]} ${key}`)
    }
    return res
};