export async function fetchHoge(): Promise<string> {
    const response = await fetch('http://easy-web-backend:8080/graphql', {
        method: 'POST',
        headers: {
            'Context-Type': 'application/json',
        },
        body: JSON.stringify({
            query: `
                query {
                    hoge
                }
            `,
        }),
    });

    if (!response.ok) {
        throw new Error(`Failed to fetch data: ${response.statusText}`);
    }

    const result = await response.json();
    return result.data.hoge;
}