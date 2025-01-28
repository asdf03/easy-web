import { fetchHoge } from "../../lib/hoge";

export default async function HogePage() {
  let data: string;

  try {
    data = await fetchHoge();
  } catch (error) {
    console.error('Error fetching data:', error);
    data = 'Error fetching data';
  }

  return (
    <main style={{ padding: '20px', fontFamily: 'Arial, sans-serif' }}>
      <h1>API Response</h1>
      <p>{data}</p>
    </main>
  );
}