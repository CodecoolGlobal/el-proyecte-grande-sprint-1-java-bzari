export default function useCancallableFetch({url, method, initialState}) {
    const [data, setData] = React.useState(initialState)
    useEffect( () => {
        let cancelled = false;
        const cleanUp = () => cancelled = true;
        fetch(url,
              {method:method,
               headers: {"accept":"application/json"}})
            .then(res => {
                if (cancelled) throw new Error("Fetch cancelled");
                return res.json();
            })
            .then(data => setData(data))
            .catch(_e => {});

        return cleanUp;
    }, [])
    return data;
}
